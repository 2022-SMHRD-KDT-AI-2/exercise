<%@page import="kr.smhrd.entity.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	BoardVO vo=new BoardVO();
	vo.setIdx(1);
	vo.setTitle("게시판");
	vo.setWriter("김유진");
	vo.setIndate("2022-02-26");
	vo.setCount(1);
	request.setAttribute("vo", vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<thead>
  <tr>
    <th>번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>작성일</th>
    <th>조회수</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td>${vo.idx}</td>
    <td>${vo.title}</td>
    <td>${vo.writer}</td>
    <td>${vo.indate}</td>
    <td>${vo.count}</td>
  </tr>
</tbody>
</table>
</body>
</html>