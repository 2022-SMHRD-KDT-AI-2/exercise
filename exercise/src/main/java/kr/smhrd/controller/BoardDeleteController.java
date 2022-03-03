package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;

public class BoardDeleteController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		  int idx=Integer.parseInt(request.getParameter("idx")); 
		  BoardDAO dao=new BoardDAO();
	      dao.boardDelete(idx);  
//	      nextVew="redirect:/boardList.do";
	      return "redirect:/boardList.do";
	}

}
