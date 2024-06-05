<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Settings</title>
    <link rel="stylesheet" type="text/css" href="CSS/Settings.css">
</head>
<body>
    <%
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        String userName = "";
        String email = "";
        String college = "";
        String department = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

            String sql = "SELECT username, email, college, department FROM users WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                userName = resultSet.getString("username");
                email = resultSet.getString("email");
                college = resultSet.getString("college");
                department = resultSet.getString("department");
            }
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    %>

    <div class="settings-container">
        <h1>Settings</h1>
        <form action="UpdateProfileForSettings" method="post">
            <h2>Profile Information</h2>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" value="<%= userName %>" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="<%= email %>" required>

            <label for="college">College:</label>
            <input type="text" id="college" name="college" value="<%= college %>" required>

            <label for="department">Department:</label>
            <input type="text" id="department" name="department" value="<%= department %>" required>

            <input type="submit" value="Update Profile">
        </form>

        <form action="ChangePassword" method="post">
            <h2>Change Password</h2>
            <label for="currentPassword">Current Password:</label>
            <input type="password" id="currentPassword" name="currentPassword" required>

            <label for="newPassword">New Password:</label>
            <input type="password" id="newPassword" name="newPassword" required>

            <label for="confirmPassword">Confirm Password:</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required>

            <input type="submit" value="Change Password">
        </form>
    </div>
</body>
</html>
