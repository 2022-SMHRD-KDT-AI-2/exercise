package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "member/login.jsp";
		HttpSession session = request.getSession();
		if (session.getAttribute("loginUser") != null) {// �씠誘� 濡쒓렇�씤 �맂 �궗�슜�옄�씠硫�
			url = "main.jsp"; // 硫붿씤 �럹�씠吏�濡� �씠�룞�븳�떎.
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String url = "member/login.jsp";
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.userCheck(userid, pwd);
		if (result == 1) {
			MemberVO mVo = mDao.getMember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVo);
			request.setAttribute("message", "�쉶�썝 媛��엯�뿉 �꽦怨듯뻽�뒿�땲�떎.");
			url = "main.jsp";
		} else if (result == 0) {
			request.setAttribute("message", "鍮꾨�踰덊샇媛� 留욎� �븡�뒿�땲�떎.");
		} else if (result == -1) {
			request.setAttribute("message", "議댁옱�븯吏� �븡�뒗 �쉶�썝�엯�땲�떎.");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}