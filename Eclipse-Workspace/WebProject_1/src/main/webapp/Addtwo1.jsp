<%@ page errorPage="Myerror.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method='get'>
<input type='text' name='t1' size=30>
<input type='text' name='t2' size=30>
<input type='submit' value='submit'>
</form>

<%! int a,b; %>
<% if(request.getParameter("t1")!=null) {
	a = Integer.parseInt(request.getParameter("t1"));
} 

if(request.getParameter("t2")!=null) {
	a = Integer.parseInt(request.getParameter("t2"));
}
b=a+b;
out.println("the sum is "+b);
%>
</body>
</html>