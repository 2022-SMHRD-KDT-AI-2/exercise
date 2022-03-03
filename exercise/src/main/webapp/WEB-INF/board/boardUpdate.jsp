<%@page import="kr.smhrd.entity.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
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
    <div class="panel-heading">BOARD</div>
    <div class="panel-body">
       <form action="/web/boardUpdate.do" method="post"> 
       <input type="hidden" name="idx" value="${vo.idx}">
       <table class="table table-boardered">
          <tr>
             <td>제목</td>
             <td><input type="text" class="form-control" name="title" value="${vo.title}"></td>
          </tr>
          <tr>
             <td>내용</td>
             <td><textarea rows="10" class="form-control" name="content">${vo.count}</textarea></td>
          </tr>
          <tr>
             <td>작성자</td>
             <td><input type="text" class="form-control" readonly="readonly" value="${vo.writer}"></td>
          </tr>
          <tr>
             <td colspan="2" align="center">
                <button type="submit" class="btn btn-info btn-sm">수정하기</button>
                <button type="reset" class="btn btn-warning btn-sm" onclick="location.href='/web/boardList.do'">취소</button>
                <button type="button" class="btn btn-success btn-sm" onclick="location.href='/web/boardList.do'">리스트</button>
             </td>
          </tr>
       </table>
       </form>
    </div>
    <div class="panel-footer">인공지능 융합서비스 개발자 과정(김유진)</div>
  </div>
</div>

</body>
</html>
    