package jsp_jdbc1;
import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mysqlservlet1
 */
@WebServlet(description="jdbc mysql", urlPatterns= {"/jdbc1"})
public class Mysqlservlet1 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection c;
	java.sql.Statement s;
	public Mysqlservlet1() {
		super();
	}
	public void init() throws ServletException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		}catch(ClassNotFoundException e) {
			System.out.println("Class for driver is missing");
		}
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?UseSSL=false","root", "Abhay@123");
			System.out.println("Connected..");
			s = c.createStatement();
			
		}catch(SQLException e) {System.err.println(e);}
	}
	
	/**
	 * @see HttpSevlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setHeader("Content-type", "text/html");
		PrintWriter out = res.getWriter();
		try {
			ResultSet rs=s.executeQuery("select * from my_table");
			out.println("<html>");
			out.println("<body>");
			out.println("<table cell padding = 20 cell spacing = 10 border = 10> <tr>  <th>Name</th> <th>Age</th> <th>Area</th>  </tr>");
			while(rs.next()) {
				out.println("<tr> <td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td></tr>");
			}
			out.println("</font> </body> </html>");
		} catch(SQLException e) {}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}

}




































