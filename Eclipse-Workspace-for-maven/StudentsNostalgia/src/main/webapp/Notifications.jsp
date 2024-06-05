<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notifications</title>
    <link rel="stylesheet" type="text/css" href="CSS/Notifications.css">
</head>
<body>
    <%
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

            String notificationsSql = "SELECT * FROM notifications WHERE user_id = ? ORDER BY notification_date DESC";
            PreparedStatement notificationsStmt = conn.prepareStatement(notificationsSql);
            notificationsStmt.setInt(1, userId);
            ResultSet notificationsRs = notificationsStmt.executeQuery();
    %>

    <div class="notifications-container">
        <h1>Notifications</h1>
        <div class="notifications-list">
            <%
                while (notificationsRs.next()) {
                    String notificationText = notificationsRs.getString("notification_text");
                    Timestamp notificationDate = notificationsRs.getTimestamp("notification_date");
            %>
            <div class="notification-item">
                <p><%= notificationText %></p>
                <p class="notification-date"><%= notificationDate %></p>
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
