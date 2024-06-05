package servletApplications;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProfileForSettings extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String college = request.getParameter("college");
        String department = request.getParameter("department");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

            String sql = "UPDATE users SET username = ?, email = ?, college = ?, department = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, college);
            statement.setString(4, department);
            statement.setInt(5, userId);
            statement.executeUpdate();

            conn.close();
            session.setAttribute("userName", username); // Update session with new username
            response.sendRedirect("Settings.jsp?success=Profile updated successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("Settings.jsp?error=An error occurred. Please try again.");
        }
    }
}
