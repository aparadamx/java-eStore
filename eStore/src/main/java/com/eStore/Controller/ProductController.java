package com.eStore.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.eStore.DB.DB;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product product = new Product();
		product.code = Integer.parseInt(request.getParameter("txtCode"));
		product.name = request.getParameter("txtName");
		product.price = Integer.parseInt(request.getParameter("txtPrice"));
		
		System.out.println("[Product Servlet] Product Details: " + product);
		
		DB db = new DB();
		int result = db.addProduct(product);
		db.closeConnection();
	}
}