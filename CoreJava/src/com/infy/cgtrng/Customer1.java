package com.infy.cgtrng;

public class Customer1 {
	String customerId;
	String customerName;
	long customerContact;
	String Address;

	Customer1(String customerId,String customerName,long customerContact,String Address)
	{
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerContact=customerContact;
		this.Address=Address;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying Customer Details \n********************");
		System.out.println("Customer Id:"+customerId);
		System.out.println("Customer Name:"+customerName);
		System.out.println("Customer Contact:"+customerContact);
		System.out.println("Customer Address:"+Address);
	}


	public static void main(String args[]) {
	
		Customer1 customer=new Customer1(null, null, 0, null);

		customer.customerName="Jacob";
		customer.customerContact=5648394590L;
		customer.Address="13th Street,New York";

		customer.displayCustomerDetails();
	}

}
