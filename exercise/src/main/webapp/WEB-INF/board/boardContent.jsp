<%@page import="kr.smhrd.entity.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name=ㄴ"viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
     function goList(){
        location.href="/web/boardList.do";
     }
     function goDel(idx){
        location.href="/web/boardDelete.do?idx="+idx;  // /web/boardDelete.do?idx=28
     }
     function goUpForm(idx){
        location.href="/web/boardUpdateForm.do?idx="+idx;
     }
  </script>
  
</head>
<body>
 
<div class="container">
  <h2>MVC Framework 04</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BOARD</div>
    <div class="panel-body">
       <table class="table table-bordered">
         <tr>
            <td>번호</td>
            <td>${vo.idx}</td>
         </tr>
         <tr>
            <td>제목</td>
            <td>${vo.title}</td>
         </tr>         
         <tr>
            <td>내용</td>
            <td>${vo.content}</td>
         </tr>  
         <tr>
            <td>작성자</td>
            <td>${vo.writer}</td>
         </tr>  
         <tr>
            <td>작성일</td>
            <td>${vo.indate}</td>
         </tr>  
         <tr>
	         <td colspan="2" align="center">
	            <button class="btn btn-info btn-sm" onclick="goUpForm(${vo.idx})">수정</button>
	            <button class="btn btn-warning btn-sm" onclick="goDel(${vo.idx})">삭제</button>
	            <button class="btn btn-success btn-sm" onclick="goList()">리스트</button>
	         </td>
         </tr>
         
       </table>
    </div>
    <div class="panel-footer">인공지능 융합서비스 개발자 과정(김유진)</div>
  </div>
</div>

</body>
</html>