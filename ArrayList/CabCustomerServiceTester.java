package com.asif.collection_arraylist_scenario19_08;


public class CabCustomerServiceTester {

	public static void main(String[] args)
	{
	   CustomerService cs = new CustomerService();
	   
	   Customer c1 = new Customer(111, "Asif", "Ameerpet", "YellareddyGuda", 2, "9430249918");
	   cs.addCustomer(c1);
	   System.out.println(cs.printBill(c1));
	   
	   Customer c2 = new Customer(222, "Asiff", "Ameerpet", "YellareddyGuda", 9, "9430249918");
	   cs.addCustomer(c2);
	   System.out.println(cs.printBill(c2));
	   
	   Customer c3 = new Customer(333, "smith", "Charminar", "Begumpet", 2, "9934436178");
	   cs.addCustomer(c3);
	   System.out.println(cs.printBill(c3));
	}

}
