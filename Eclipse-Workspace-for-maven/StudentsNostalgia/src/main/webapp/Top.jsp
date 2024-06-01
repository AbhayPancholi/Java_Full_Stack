<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title><%= request.getAttribute("title") != null ? request.getAttribute("title") : "Student Autograph Application" %></title>
    <link rel="stylesheet" type="text/css" href="CSS/Top.css">
</head>
<body>
    <header>
        <div class="header-container">
            <div class="logo">
                <a href="index.jsp">
                    <img src="Images/Logo.png" alt="Student Autograph Application Logo">
                </a>
            </div>
            <nav>
                <ul class="nav-menu">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="register.jsp">Register</a></li>
                    <li><a href="login.jsp">Login</a></li>
                </ul>
            </nav>
            <div class="search-container">
                <form action="search.jsp" method="get">
                    <input type="text" name="query" placeholder="Search...">
                    <button type="submit">Search</button>
                </form>
            </div>
        </div>
    </header>
       
        <!-- Main content starts here -->
