<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="CSS/Registration.css">
</head>
<body>
    <div class="registration-container">
        <h2>User Registration</h2>
        
        <%-- Check if there's an error message --%>
        <% String errorMessage = request.getParameter("error"); %>
        <% if (errorMessage != null && !errorMessage.isEmpty()) { %>
            <div class="error-message">
                <%= errorMessage %>
            </div>
        <% } %>
        
        <form action="Registration" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="college">College:</label>
            <select id="college" name="college" required>
                <!-- Options will be dynamically populated -->
                <option value="2533">CSMSS Chh. Shahu College of Engineering</option>
            </select>
            
            <label for="department">Department:</label>
            <select id="department" name="department" required>
                <!-- Options will be dynamically populated -->
                <option value="1">Artificial Intelligence and Data Science</option>
                <option value="2">Computer Science and Engineering</option>
                <option value="3">Electronics and Telecommunication</option>
            </select>
            
            <label for="batchYear">Batch Year:</label>
            <input type="text" id="batchYear" name="batchYear" required>
            
            <input type="submit" value="Register">
        </form>
        
        <div class="login-link">
            <p>Already registered? <a href="login.jsp">Login here</a></p>
        </div>
    </div>
</body>
</html>
