package com.eStore.Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.print.PrintService;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("txt/html");
		PrintWriter out = response.getWriter();
		out.print("<center>");
		
		//out.print("<h3>Welcome to Front Controller</h3>");
		
		String typeOfRequest = request.getParameter("txtType");
		String url = "";
		
		if(typeOfRequest.equals("login")) {
			url = "login";
			
		}else if(typeOfRequest.equals("register")) {
			url = "Register";
		}else {
			out.print("<h3>Sorry!.. Request Cannot be Processed</h3>");
		}
		
		if(!url.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			//dispatcher.forward(request, response);
			dispatcher.include(request, response);
		}
		out.print("</center>");
	}

}
