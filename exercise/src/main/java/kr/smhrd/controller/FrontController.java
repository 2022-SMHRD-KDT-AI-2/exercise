package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;


public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//1. Ŭ���̾�Ʈ�� ��û(URL)�� Ȯ��(�ľ�)�ϴ� �۾�
		// /boardList.do
		String reqPath=request.getRequestURI();
		//System.out.println(reqPath); // /web/boardDelete.do
		String cpath=request.getContextPath(); 
		//System.out.println(Path); // /web
		String command=reqPath.substring(cpath.length());
		System.out.println(command); // /boardUpdate.do		
		//2. ��û�� ���� �б��۾�
		BoardDAO dao=new BoardDAO();	
		//***View�� ��θ� �����ϴ� ����***
		String nextVew=null;
		Controller controller=null;
		// HandlerMapping(�ڵ鷯�����۾�)=>������ API(class)
		HandlerMapping mapping=new HandlerMapping();
	    controller=mapping.getController(command);
	    nextVew=controller.requestHandler(request, response);
		// 3. ���⼭ nextView�� ������ ���� => forward or redirect�� �ϱ�
		if(nextVew!=null) {
	         if(nextVew.indexOf("redirect:")!=-1) {
	          nextVew=nextVew.split(":")[1];   
	          response.sendRedirect("/exercise"+nextVew); // 1. redirect
	         }else {
	          //���ǳ������̸�(boardList)->���ǹ��������̸�(���)���� �����Ű�� API : ViewResolver
	          RequestDispatcher rd=request.getRequestDispatcher(ViewResolver.makeURL(nextVew));
	          rd.forward(request, response); // 2. forward
	         }
	     }
	}//_
}
