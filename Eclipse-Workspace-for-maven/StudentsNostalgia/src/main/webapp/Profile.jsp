<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <link rel="stylesheet" type="text/css" href="CSS/Profile.css">
</head>
<body>
    <%
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        String userName = "";
        String userEmail = "";
        int collegeId = (int) session.getAttribute("collegeId");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

            // Fetch user information
            String userSql = "SELECT * FROM users WHERE id = ?";
            PreparedStatement userStmt = conn.prepareStatement(userSql);
            userStmt.setInt(1, userId);
            ResultSet userRs = userStmt.executeQuery();
            if (userRs.next()) {
                userName = userRs.getString("username");
                userEmail = userRs.getString("email");
            }

            // Fetch user images
            String imagesSql = "SELECT * FROM images WHERE user_id = ? ORDER BY upload_date DESC";
            PreparedStatement imagesStmt = conn.prepareStatement(imagesSql);
            imagesStmt.setInt(1, userId);
            ResultSet imagesRs = imagesStmt.executeQuery();
    %>

    <div class="profile-container">
        <h1>Profile</h1>
        <div class="profile-info">
            <p><strong>Username:</strong> <%= userName %></p>
            <p><strong>Email:</strong> <%= userEmail %></p>
            <form action="UpdateProfile" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" value="<%= userName %>" required>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="<%= userEmail %>" required>
                <button type="submit">Update Profile</button>
            </form>
        </div>
        <div class="uploaded-images">
            <h2>Your Uploaded Images</h2>
            <%
                while (imagesRs.next()) {
                    int imageId = imagesRs.getInt("id");
                    String imagePath = imagesRs.getString("image_path");
                    Timestamp uploadDate = imagesRs.getTimestamp("upload_date");
            %>
            <div class="image-post">
                <img src="<%= imagePath %>" alt="Uploaded Image">
                <p><%= uploadDate %></p>
                <form action="DeleteImage" method="post">
                    <input type="hidden" name="imageId" value="<%= imageId %>">
                    <button type="submit">Delete</button>
                </form>
            </div>
            <%
                }
                conn.close();
            %>
        </div>
    </div>
    <%
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    %>
</body>
</html>
