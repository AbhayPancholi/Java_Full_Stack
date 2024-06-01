package servletApplications;

import java.util.Map;
//import java.util.HashMap;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//@WebServlet("/register")
public class Registration extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String college_name = null;
        String department_name = null;
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        int collegeId = Integer.parseInt(request.getParameter("college"));
        int departmentId = Integer.parseInt(request.getParameter("department"));
        int batchyear = Integer.parseInt(request.getParameter("batchYear"));
        
        if(collegeId == 2533) {college_name = "CSMSS Chh. Shahu College of Engineering";}
        
        Department_dict  dict = new Department_dict();
        Map<Integer, String> map = dict.getMap();
        
        if(map.containsKey(departmentId)) {department_name = map.get(departmentId);}

        // Hash the password before storing it
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_reg_details", "root", "Abhay@123");

         // Check if the username or email already exists
            String checkUserQuery = "SELECT * FROM users WHERE username = ? OR email = ?";
            PreparedStatement checkUserStatement = conn.prepareStatement(checkUserQuery);
            checkUserStatement.setString(1, username);
            checkUserStatement.setString(2, email);
            ResultSet resultSet = checkUserStatement.executeQuery();

            // If username or email already exists, redirect back to registration page with an error message
            if (resultSet.next()) {
                response.sendRedirect("register.jsp?error=Username or email already exists.");
                return;
            }
            
            
            String checkCollegeQuery = "SELECT * FROM colleges WHERE id = ?";
            PreparedStatement checkCollegeStatement = conn.prepareStatement(checkCollegeQuery);
            checkCollegeStatement.setInt(1, collegeId);
            ResultSet collegeResult = checkCollegeStatement.executeQuery();

            // Check if the department_id already exists
            String checkDepartmentQuery = "SELECT * FROM departments WHERE id = ?";
            PreparedStatement checkDepartmentStatement = conn.prepareStatement(checkDepartmentQuery);
            checkDepartmentStatement.setInt(1, departmentId);
            ResultSet departmentResult = checkDepartmentStatement.executeQuery();

            // If college_id and department_id already exists, insert into the users only.
            if (collegeResult.next() && !departmentResult.next()) {
            	
            	String department_table = "INSERT INTO departments (id, name, college_id) VALUES (?, ?, ?)";
                PreparedStatement department_table_statement = conn.prepareStatement(department_table);
                department_table_statement.setInt(1, departmentId);
                department_table_statement.setString(2, department_name);
                department_table_statement.setInt(3, collegeId);
                department_table_statement.executeUpdate();
            	
            	String users_table = "INSERT INTO users (username, password, email, college_id, department_id, batch_year) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(users_table);
                statement.setString(1, username);
                statement.setString(2, hashedPassword);
                statement.setString(3, email);
                statement.setInt(4, collegeId);
                statement.setInt(5, departmentId);
                statement.setInt(6, batchyear);
                statement.executeUpdate();
                
            }else if(collegeResult.next() && departmentResult.next()) {
            	String users_table = "INSERT INTO users (username, password, email, college_id, department_id, batch_year) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(users_table);
                statement.setString(1, username);
                statement.setString(2, hashedPassword);
                statement.setString(3, email);
                statement.setInt(4, collegeId);
                statement.setInt(5, departmentId);
                statement.setInt(6, batchyear);
                statement.executeUpdate();
                
            }else {
	            String colleges_table = "INSERT INTO colleges (id, name) VALUES (?,?)";
	            PreparedStatement colleges_table_statement = conn.prepareStatement(colleges_table);
	            colleges_table_statement.setInt(1, collegeId);
	            colleges_table_statement.setString(2, college_name);
	            
	            String department_table = "INSERT INTO departments (id, name, college_id) VALUES (?, ?, ?)";
	            PreparedStatement department_table_statement = conn.prepareStatement(department_table);
	            department_table_statement.setInt(1, departmentId);
	            department_table_statement.setString(2, department_name);
	            department_table_statement.setInt(3, collegeId);
	            
	            String users_table = "INSERT INTO users (username, password, email, college_id, department_id, batch_year) VALUES (?, ?, ?, ?, ?, ?)";
	            PreparedStatement statement = conn.prepareStatement(users_table);
	            statement.setString(1, username);
	            statement.setString(2, hashedPassword);
	            statement.setString(3, email);
	            statement.setInt(4, collegeId);
	            statement.setInt(5, departmentId);
	            statement.setInt(6, batchyear);
	
	            colleges_table_statement.executeUpdate();
	            department_table_statement.executeUpdate();
	            statement.executeUpdate();
            }
	            response.sendRedirect("login.jsp");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?error=Something went wrong please try again");
        }
    }
}
