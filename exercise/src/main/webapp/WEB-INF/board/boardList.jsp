<%@page import="kr.smhrd.entity.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
 
<div class="container">
  <h2>MVC Framework 04</h2>
  <div class="panel panel-default">
    <div class="panel-heading">
		<form class="form-inline" action="/action_page.php">
	  <div class="form-group">
	    <label for="email">ID:</label>
	    <input type="email" class="form-control" id="email">
	  </div>
	  <div class="form-group">
	    <label for="pwd">Password:</label>
	    <input type="password" class="form-control" id="pwd">
	  </div>
	  <div class="checkbox">
	    <label><input type="checkbox"> Remember me</label>
	  </div>
	  <button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
    <div class="panel-body">
    	<table class="table table-bordered table-hover">
    	<tr>
    	    <td>번호</td>
    	    <td>제목</td>
    	    <td>작성자</td>
    	    <td>작성일</td>
    	    <td>조회수</td>
    	  </tr>
    	  <c:forEach var="vo" items="${list}">
    	  	  <tr>
    	        <td>${vo.idx}</td>
    	        <td><a href="/web/boardContent.do?idx=${vo.idx}">${vo.title}</a></td>
    	        <td>${vo.writer}</td>
    	        <td>${vo.indate}</td>
    	        <td>${vo.count}</td>
    	      </tr>
    	  </c:forEach>
    	  <tr>
    	    <td colspan="5">
    	    <button class="btn btn-success btn-sm" onclick="location.href='/web/boardForm.do'">글쓰기</button>
    	    </td>
    	  </tr>
    	</table>
    </div>
    <div class="panel-footer">인공지능 융합서비스 개발자 과정(김유진)</div>
  </div>
</div>

</body>
</html>
