package com.eStore.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.eStore.Controller.Product;

public class DB {
	public Connection connection;
	PreparedStatement preparedStatement;
	
	public DB() {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded..");		
			connection = DriverManager.getConnection("Driver={PostgreSQL ODBC Driver(UNICODE)};Server=localhost;Port=5432;Database=eStore;UID=admin;PWD=testing");
			jdbc:postgresql://${server.address}/?user=${admin}&password=${testing}
			System.out.println("[DB] Conection created");
		}catch (Exception e) {
			System.out.println("something was wrong...");
		}
	}
	
	public int addProduct(Product product) {
		int result = 0;
		
		try {
			String sql = "insert Product values(null, ?, ? ,?)";
			preparedStatement.setInt(1, product.code);
			preparedStatement.setString(2, product.name);
			preparedStatement.setInt(3, product.price);
			preparedStatement = connection.prepareStatement(sql);

			
			result = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println("[DB] connection was closed");
		}catch (Exception e){
			System.out.println(e);
		}
	}
}
