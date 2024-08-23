package com.eStore.Controller;

public class Product {
	//Atributes
	public int id;
	public int code;
	public String name;
	public int price;
	
	public Product(){
		
	}
	
	public Product(int id, int code, String name, int price) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.price = price;
		System.out.println("assiged Data from product.java");
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
