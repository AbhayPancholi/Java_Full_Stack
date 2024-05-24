<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int a =10; int b= 20;
%>

<br>
The sum is <%=a+b %>
<br>
The multiplication is <%=a*b %>
<br>
The division is <%=a/b %>
<br>

<%
for(int i=0;i<=10;i++){
	
	out.println(i);%>
	
	<br><hr color="orange">
	<%}
%>
</body>
</html>