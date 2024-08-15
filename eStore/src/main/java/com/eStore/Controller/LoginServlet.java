package com.eStore.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
	/*
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	*/
    
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

}
