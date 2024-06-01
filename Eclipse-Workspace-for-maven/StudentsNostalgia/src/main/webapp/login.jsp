<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="CSS/Login.css">
</head>
<body>
    <h2>User Login</h2>
    
    <%-- Check if there's an error message --%>
    <% String errorMessage = request.getParameter("error"); %>
    <% if (errorMessage != null && !errorMessage.isEmpty()) { %>
        <div class="error-message">
            <%= errorMessage %>
        </div>
    <% } %>
    
    <form action="UserLogin" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        
        <input type="submit" value="Login">
    </form>
    
    <div class="login-link">
        <p>Not registered? <a href="register.jsp">Register here</a></p>
    </div>
</body>
</html>
