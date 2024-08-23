package com.eStore.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final String EMAIL = "admin@estore.com";
	private final String PASSWORD = "admin@123";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		//System.out.println("user Details : " + email + " " + password);
		response.setContentType("text/html");
		String message = "";
		
		if(email.equals(EMAIL) && password.equals(PASSWORD)) {
			message = "<p>Welcome to Home<br><a href='Home'>Click to navigate to home</a></p>";
		
			//1. Session Tracking With Cookies
			// Creating Cookies
			//Cookie cookie1 = new Cookie("KEY_NAME",NAME)
			
			
		}else {
			message = "<b>Invalid Username or Password";
		}
		
		
		java.sql.Date loginTimeStamp = new java.sql.Date(0);
		//String htmlResponse = "<center><h3>Welcome " + email + "<h3><p>You Loggedin at" + loginTimeStamp.toString()+"</p></center>";
		String htmlResponse = "<center><h3>Welcome " + email
				+ "<h3><pYou Attempted Login at "
				+ loginTimeStamp + "</p><br><br>"
				+message+"</center>";
		PrintWriter out =response.getWriter();
		out.print(htmlResponse);
		
	}
	
    
    /*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(request, response);
    	
		// TODO Auto-generated method stub
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		System.out.println("user Details : " + email + " " + password);
		
		response.setContentType("text/html");
		java.sql.Date loginTimeStamp = new java.sql.Date(0);
		String htmlResponse = "<center><h3>Welcome " + email + "<h3><p>You Loggedin at" + loginTimeStamp.toString()+"</p></center>";
		
		PrintWriter out =response.getWriter();
		out.print(htmlResponse);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doPost(req, resp);
    	
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		System.out.println("user Details : " + email + " " + password);
		
		response.setContentType("text/html");
		java.sql.Date loginTimeStamp = new java.sql.Date(0);
		String htmlResponse = "<center><h3>Welcome " + email + "<h3><p>You Loggedin at" + loginTimeStamp.toString()+"</p></center>";
		
		PrintWriter out =response.getWriter();
		out.print(htmlResponse);
    }
    */
    
    
    
    

}
