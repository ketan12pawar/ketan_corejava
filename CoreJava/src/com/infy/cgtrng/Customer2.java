package com.infy.cgtrng;

public class Customer2 {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String args[]) {
		Customer2 customer = new Customer2();
		
		customer.setCustomerId("C101");
		customer.setCustomerName("Jack");
		customer.setContactNumber(9870345687L);
		customer.setAddress("D089, St. Louis Street, Springfield");

		System.out.println("Displaying Customer Details");
		System.out.println("Customer Id : " + customer.getCustomerId());
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("Contact Number : " + customer.getContactNumber());
		System.out.println("Address : " + customer.getAddress());
	}

}
