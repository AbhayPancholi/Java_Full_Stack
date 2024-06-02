<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="CSS/Home.css">
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            var welcomeMessageBlock = document.querySelector(".welcome-message-block");
            if (welcomeMessageBlock) {
                setTimeout(function() {
                    welcomeMessageBlock.style.display = 'none';
                }, 10000); // 10 seconds
            }
        });
    </script>
</head>
<body>
    <%
        
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        int collegeId = (int) session.getAttribute("collegeId");
        String userName = (String) session.getAttribute("userName");
        boolean justLoggedIn = session.getAttribute("justLoggedIn") != null ? (boolean) session.getAttribute("justLoggedIn") : false;
        if (justLoggedIn) {
            session.removeAttribute("justLoggedIn");
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

            String sql = "SELECT username FROM users WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                userName = resultSet.getString("username");
            }
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    %>

    <% if (justLoggedIn) { %>
    <div class="welcome-message-block">
        <h1 class="welcome-message">Welcome, <%= userName %>!</h1>
    </div>
    <% } %>
    
    <nav>
        <ul>
        	<li><a href="Logout">Logout</a></li>
        	<li><a href="Settings.jsp">Settings</a></li>
        	<li><a href="Notifications.jsp">Notifications</a></li>
        	<li><a href="upload.jsp">Upload Image</a></li>
        	<li><a href="Profile.jsp">Profile</a></li>
            <li><a href="Home.jsp">Home</a></li>
            <li class="logo"><img src="Images/Logo.png" alt="Website Logo"></li>
        </ul>
    </nav>
    
    <div class="content">
        <h2>Your College Feed</h2>
        <div class="feed">
            <%
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

                    String sql = "SELECT images.*, users.username FROM images INNER JOIN users ON images.user_id = users.id WHERE images.college_id = ? ORDER BY images.upload_date DESC";
                    PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setInt(1, collegeId);
                    ResultSet resultSet = statement.executeQuery();

                    while (resultSet.next()) {
                        int imageId = resultSet.getInt("id");
                        String imagePath = resultSet.getString("image_path");
                        String uploaderName = resultSet.getString("username");
                        Timestamp uploadDate = resultSet.getTimestamp("upload_date");
            %>
            <div class="post">
                <img src="<%= imagePath %>" alt="Image">
                <p><strong><%= uploaderName %></strong> <%= uploadDate %></p>
                <div class="post-actions">
                    <form action="Like" method="post">
                        <input type="hidden" name="imageId" value="<%= imageId %>">
                        <button type="submit">Like</button>
                    </form>
                    <form action="Share" method="post">
                        <input type="hidden" name="imageId" value="<%= imageId %>">
                        <button type="submit">Share</button>
                    </form>
                </div>
                <div class="comments">
                    <form action="Comment" method="post">
                        <input type="hidden" name="imageId" value="<%= imageId %>">
                        <textarea name="comment" required></textarea>
                        <button type="submit">Comment</button>
                    </form>
                    <%
                        String commentSql = "SELECT comments.*, users.username FROM comments INNER JOIN users ON comments.user_id = users.id WHERE comments.image_id = ? ORDER BY comments.comment_date DESC";
                        PreparedStatement commentStmt = conn.prepareStatement(commentSql);
                        commentStmt.setInt(1, imageId);
                        ResultSet commentResult = commentStmt.executeQuery();
                        while (commentResult.next()) {
                            String commentText = commentResult.getString("comment_text");
                            String commenterName = commentResult.getString("username");
                    %>
                    <p><strong><%= commenterName %></strong>: <%= commentText %></p>
                    <%
                        }
                    %>
                </div>
            </div>
            <%
                    }
                    conn.close();
                } catch (SQLException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            %>
        </div>
    </div>
</body>
</html>
