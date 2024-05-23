package test23;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TourGuidance extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession usersession = req.getSession(false);
		String visitor = (String)usersession.getAttribute("username");
		out.println("Welcome to SambhajiNagar"+visitor);
		out.println("<html><body><ul>");
		out.println("<li>Ajantha</li>");
		out.println("<li>Elora</li>");
		out.println("<li>Bibi ka Maqbara</li>");
		out.println("<li>Kanchanwadi</li>");
		out.println("</ul></body></html>");
		out.close();
	}
}
