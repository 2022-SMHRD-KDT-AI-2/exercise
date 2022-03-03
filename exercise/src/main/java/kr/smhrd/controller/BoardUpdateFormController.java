package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.entity.BoardVO;
import kr.smhrd.model.BoardDAO;

public class BoardUpdateFormController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  int idx=Integer.parseInt(request.getParameter("idx")); 
		  BoardDAO dao=new BoardDAO();
	      BoardVO vo=dao.getByIdx(idx);
	      request.setAttribute("vo",vo);
//	      nextVew="boardUpdate";		
	      return "boardUpdate";
	}
	

}
