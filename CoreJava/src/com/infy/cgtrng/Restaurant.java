package com.infy.cgtrng;

public class Restaurant {
	String restaurantName;
	long restaurantContact;
	String restaurantAddress;
	float rating;
	
	Restaurant(String restaurantName,float rating,long restaurantContact,String restaurantAddress)
	{
	this.restaurantName=restaurantName;
	this.restaurantContact=restaurantContact;
	this.restaurantAddress=restaurantAddress;
	this.rating=rating;
	}

	public void displayRestaurantDetails()
	{
		System.out.println("Restaurant Name: "+restaurantName);
		System.out.println("***************************");
		System.out.println("Restaurant Rating: "+rating);
		System.out.println("Restaurant Contact: "+restaurantContact);
		System.out.println("Restaurant Address: "+restaurantAddress);
	}

	public static void main(String[] args) {
		Restaurant sf=new Restaurant("McDonald's",4.1f,9988676767L,"SH1109, Carolina Street, Springfield");
		sf.displayRestaurantDetails();
		
	}
}

