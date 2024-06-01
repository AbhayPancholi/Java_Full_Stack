<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
    <link rel="stylesheet" type="text/css" href="CSS/Error_Style.css">
</head>
<body>
    <div class="container">
        <h1>Oops! Something went wrong.</h1>
        <p class="message">${errorMessage}</p>
        <a href="Welcome.jsp" class="home-link">Go to Home</a>
    </div>
</body>
</html>
