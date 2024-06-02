package servletApplications;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

            String sql = "SELECT * FROM users WHERE username = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String storedHash = resultSet.getString("password");
                if (BCrypt.checkpw(password, storedHash)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("userId", resultSet.getInt("id"));
                    session.setAttribute("collegeId", resultSet.getInt("college_id"));
                    session.setAttribute("departmentId", resultSet.getInt("department_id"));
                    session.setAttribute("username", resultSet.getString("username"));
                    session.setAttribute("justLoggedIn", true);

                    response.sendRedirect("Home.jsp");
                } else {
                    response.sendRedirect("login.jsp?error=Invalid%20credentials.%20Please%20try%20again.");
                }
            } else {
                response.sendRedirect("login.jsp?error=Invalid%20credentials.%20Please%20try%20again.");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("javax.servlet.error.message", e.getMessage());
            response.sendRedirect("error");
        }
    }
}
