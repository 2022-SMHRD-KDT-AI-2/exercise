package kr.smhrd.controller;

import java.util.HashMap;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;
	public HandlerMapping() {
	   mappings=new HashMap<String, Controller>();
       mappings.put("/boardList.do", new BoardListController());
       mappings.put("/boardForm.do", new BoardFormController());
       mappings.put("/boardInsert.do", new BoardInsertController());
       mappings.put("/boardContent.do", new BoardContentController());
       mappings.put("/boardDelete.do", new BoardDeleteController());
       mappings.put("/boardUpdateForm.do", new BoardUpdateFormController());
       mappings.put("/boardUpdate.do", new BoardUpdateController());
       //새로운 요청이 발생하면 여기서부터 출발~~
       mappings.put("/login.do", new LoginController());
	}
	public Controller getController(String key) {
		return mappings.get(key);
	}

}
