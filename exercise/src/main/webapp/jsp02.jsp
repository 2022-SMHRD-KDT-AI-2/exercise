<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
	  <% for(int i=2; i<10; i++){ %>
		<td><%=i%>단</td>
	<% }%>
	</tr>
	<% for(int i=1; i<10; i++){ %>
	<tr>
	  <% for(int j=2; j<10; j++){ %>
		<td><%=j%>*<%=i%>=<%=j*i%></td>
	  <% } %>
	</tr>
	<% }%>
</table>
</body>
</html>