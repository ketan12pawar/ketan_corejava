package com.infy.cgtrng;

public class Food {
	String foodName;
	String cuisine;
	String foodType;
	int quantityAvailable;
	double unitPrice;

	public void displayFoodDetails() {
		System.out.println("Displaying Food Detail");
		System.out.println("Food Name:"+foodName);
		System.out.println("Cuisine Name:"+cuisine);
		System.out.println("Food Type:"+foodType);
		System.out.println("Quantity Available:"+quantityAvailable);
		System.out.println("Unit Price:"+unitPrice);
		System.out.println();
	}

	public static void main(String args[]) {
		Food f = new Food();

		f.foodName = "batti";
		f.cuisine = "Indian";
		f.foodType = "Veg";
		f.quantityAvailable = 10;
		f.unitPrice = 20;

		f.displayFoodDetails();
	}		
}