package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.entity.BoardVO;
import kr.smhrd.model.BoardDAO;

public class BoardUpdateController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idx=Integer.parseInt(request.getParameter("idx"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        BoardDAO dao=new BoardDAO();
        BoardVO vo = new BoardVO();
        vo.setIdx(idx);
        vo.setTitle(title);
        vo.setContent(content);	   
        dao.boardUpdate(vo); 
//      nextVew="redirect:/boardList.do";		
		return "redirect:/boardList.do";
	}

}
