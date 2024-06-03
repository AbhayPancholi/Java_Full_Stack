<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Comments</title>
    <link rel="stylesheet" type="text/css" href="CSS/Comments.css">
</head>
<body>
    <%
        
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int imageId = Integer.parseInt(request.getParameter("imageId"));
        int userId = (int) session.getAttribute("userId");
    %>

    <div class="comments-section">
        <h2>Comments</h2>
        <div class="comments-list">
            <%
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

                    String sql = "SELECT comments.*, users.username FROM comments INNER JOIN users ON comments.user_id = users.id WHERE comments.image_id = ? ORDER BY comments.comment_date DESC";
                    PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setInt(1, imageId);
                    ResultSet resultSet = statement.executeQuery();

                    while (resultSet.next()) {
                        String commenterName = resultSet.getString("username");
                        String commentText = resultSet.getString("comment_text");
                        Timestamp commentDate = resultSet.getTimestamp("comment_date");
            %>
            <div class="comment">
                <p><strong><%= commenterName %></strong> <%= commentDate %></p>
                <p><%= commentText %></p>
            </div>
            <%
                    }
                    conn.close();
                } catch (SQLException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            %>
        </div>
        <div class="add-comment">
            <h3>Add a Comment</h3>
            <form action="Comments" method="post">
                <input type="hidden" name="imageId" value="<%= imageId %>">
                <textarea name="comment" required></textarea>
                <button type="submit">Comment</button>
            </form>
        </div>
    </div>
</body>
</html>
