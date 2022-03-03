<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%!
	public int hap (){
		int sum=0;
		for(int i=1; i<=10; i++){
			sum+=i;
	}
		return sum; //55
}
%>
 <%
 	int v=hap();
 
	// request, response, out, pageContext, session, application, config, page -> 이미 만들어진 객체(JSP내장객체)
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- jsp주석 --%>
	<!-- html주석 -->
	<table border="1">
		<tr>
			<td>1~10까지의 총합</td>
			<td><%=v%></td>
		</tr>
	</table>
</body>
</html>