package test23;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sessiontest1 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String HttpSession=null;
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession usersession = req.getSession(true);
		String visitor = req.getParameter("visitorname");
		usersession.setAttribute("username", visitor);
		out.println("Welcome to SambhajiNagar: "+visitor);
		out.println("<a href='tour'>Tour</a>");
		out.close();
	}

}