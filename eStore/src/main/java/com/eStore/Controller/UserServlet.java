package com.eStore.Controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		StringBuffer responseText = new StringBuffer();
		responseText.append("<center>");
		
		ServletConfig config =  getServletConfig();
		String  appName= config.getInitParameter("appName");
		
		ServletContext context = getServletContext();
		String dbURL = context.getInitParameter("dbURL");
		responseText.append("<h3>" + dbURL + "</h3>");
		
		responseText.append("<h3>" + appName + "</h3>");
		
		Enumeration<String> paramNames = config.getInitParameterNames();
		while(paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			String value = config.getInitParameter(name);
			responseText.append("<p>" + name + " " + value + "</p>");
		}
		

		responseText.append("</center>");
		
		out.print(responseText.toString());
		
		
	}

}
