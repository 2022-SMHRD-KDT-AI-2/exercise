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
		//1. 클라이언트의 요청(URL)을 확인(파악)하는 작업
		// /boardList.do
		String reqPath=request.getRequestURI();
		//System.out.println(reqPath); // /web/boardDelete.do
		String cpath=request.getContextPath(); 
		//System.out.println(Path); // /web
		String command=reqPath.substring(cpath.length());
		System.out.println(command); // /boardUpdate.do		
		//2. 요청에 따른 분기작업
		BoardDAO dao=new BoardDAO();	
		//***View의 경로를 저장하는 변수***
		String nextVew=null;
		Controller controller=null;
		// HandlerMapping(핸들러매핑작업)=>별도의 API(class)
		HandlerMapping mapping=new HandlerMapping();
	    controller=mapping.getController(command);
	    nextVew=controller.requestHandler(request, response);
		// 3. 여기서 nextView의 정보를 보고 => forward or redirect를 하기
		if(nextVew!=null) {
	         if(nextVew.indexOf("redirect:")!=-1) {
	          nextVew=nextVew.split(":")[1];   
	          response.sendRedirect("/exercise"+nextVew); // 1. redirect
	         }else {
	          //뷰의논리적인이름(boardList)->뷰의물리적인이름(경로)으로 변경시키는 API : ViewResolver
	          RequestDispatcher rd=request.getRequestDispatcher(ViewResolver.makeURL(nextVew));
	          rd.forward(request, response); // 2. forward
	         }
	     }
	}//_
}
