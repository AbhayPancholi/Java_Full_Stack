package test23;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addservlet23 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Addservlet23() {
		
		System.out.println("constructor of Addservlet23 is called");
	}
	public void init() {
		
		System.out.println("init method of Addservlet23 is called");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
		System.out.println("get method called");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int a=Integer.parseInt(request.getParameter("t1"));
		int b=Integer.parseInt(request.getParameter("t2"));
		int c=a+b;
		out.println(c);
		out.println("end of the code");
		 
		
		
		
	}
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException{
		System.out.println("post method called");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int a=Integer.parseInt(request.getParameter("t1"));
		int b=Integer.parseInt(request.getParameter("t2"));
		int c=a+b;
		out.println(c);
		
//doGet(request,response);		
		
		
	}

public void destroy() {
	
	System.out.println("destroy method of Addservlet23 is called when the code got a change to check wewww");
}

}