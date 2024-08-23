package com.eStore.Controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MyAppListener
 *
 */
public class MyAppListener implements ServletContextListener, HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MyAppListener() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub

    	ServletContextListener.super.contextInitialized(sce);
    	
    	System.out.println("[MyAppListener] Context Initialied");
    	
    	ServletContext context = sce.getServletContext();
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		String url = context.getInitParameter("dbURL");
    		String userName = context.getInitParameter("userName");
    		String password  = context.getInitParameter("password");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
	}
    
    @Override
    public void contextDestroyed(ServletContextEvent sce)  { 
        // TODO Auto-generated method stub
    	ServletContextListener.super.contextDestroyed(sce);
    	System.out.println("[MyAppListener] Context Destroyed");
   }	
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
    	// TODO Auto-generated method stub
    	HttpSessionListener.super.sessionCreated(se);
    	HttpSession session = se.getSession();
    	session.setAttribute("newOffer", "10% off on cloting");
    }
    
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    	// TODO Auto-generated method stub
    	HttpSessionListener.super.sessionDestroyed(se);
    	System.out.println("[MyAppListener] session Destroyed");
    }
}
