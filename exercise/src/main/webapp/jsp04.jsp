<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  // Controller가 하는 작업
  String[] str = {"사과","바나나","포도","귤","오렌지"};
  request.setAttribute("str", str); // 객체바인딩
  // jsp로 forward
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
  <tr>
    <td>과일목록</td>
  </tr>
  <c:forEach var="f" items="${str}">
  	<tr>
      <td>${f}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>


