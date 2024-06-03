package servletApplications;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteImage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        int imageId = Integer.parseInt(request.getParameter("imageId"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

            // Check if the image belongs to the user
            String checkSql = "SELECT image_path FROM images WHERE id = ? AND user_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, imageId);
            checkStmt.setInt(2, userId);
            ResultSet resultSet = checkStmt.executeQuery();

            if (resultSet.next()) {
                String imagePath = resultSet.getString("image_path");

                // Delete related comments first
                String deleteCommentsSql = "DELETE FROM comments WHERE image_id = ?";
                PreparedStatement deleteCommentsStmt = conn.prepareStatement(deleteCommentsSql);
                deleteCommentsStmt.setInt(1, imageId);
                deleteCommentsStmt.executeUpdate();

                // Delete the image file from the server
                String fullPath = getServletContext().getRealPath("/") + imagePath;
                File imageFile = new File(fullPath);
                if (imageFile.exists()) {
                    imageFile.delete();
                }

                // Delete the image record from the database
                String deleteImageSql = "DELETE FROM images WHERE id = ?";
                PreparedStatement deleteImageStmt = conn.prepareStatement(deleteImageSql);
                deleteImageStmt.setInt(1, imageId);
                deleteImageStmt.executeUpdate();
            }

            conn.close();
            response.sendRedirect("Home.jsp");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}
