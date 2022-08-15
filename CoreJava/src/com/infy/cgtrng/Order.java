package com.infy.cgtrng;

public class Order {
	public int orderId;
	public String orderedFoods;
	public double totalPrice;
	public String status;

	public double calculateTotalPrice(int unitPrice){
	this.totalPrice = unitPrice + (double) (unitPrice*5)/100;//Adding 5% service tax
	System.out.println("Order Details");
	System.out.println("Order ID: " + orderId);
	System.out.println("Ordered Food: " + orderedFoods);
	System.out.println("Order Status: "+ status);
	System.out.println("Total Price: " + totalPrice);
	return this.totalPrice;
	}

	
public static void main(String[] args) {

Order order = new Order();
order.orderId = 101;
order.orderedFoods = "Spinach Alfredo Pasta";
order.status = "Ordered";

order.calculateTotalPrice(40);
}
}



