package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product product;
	
	
	public Order() {
		this.orderId=205;
		this.customerName="Praneetha";
		this.quantity=3;
	}
	
	public void display() {
		System.out.println("Following are the Oder details:");
		System.out.println("Order Id:"+orderId);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Product Id:"+product.getProductId());
		System.out.println("Product Name:"+product.getProductName());
		System.out.println("Product Price:"+product.getPrice());
		System.out.println("Product category:"+product.getCategory());
		
	}
	
	
	
	
	
	

}
