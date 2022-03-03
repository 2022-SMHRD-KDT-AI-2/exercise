package kr.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.entity.BoardVO;
import kr.smhrd.model.BoardDAO;

public class BoardListController implements Controller{
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			BoardDAO dao=new BoardDAO();
			List<BoardVO> list=dao.selectAll();
			request.setAttribute("list", list);
			String nextVew="boardList"; 
			//String nextVew="boardList" // boardList(뷰의논리적인이름)->WEB-INF/board/boardList.jsp(뷰의물리적인이름)
			return nextVew;
	}
}