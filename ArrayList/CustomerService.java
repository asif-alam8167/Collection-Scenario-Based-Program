package com.asif.collection_arraylist_scenario19_08;

import java.util.ArrayList;

public class CustomerService 
{
   private ArrayList<Customer> cust;
   
   public CustomerService()
   {
	   cust=new ArrayList<>();
   }
   
   public void addCustomer(Customer customer)
   {
	   cust.add(customer);   
   }
   private boolean isFirstCustomer(Customer customer)
   {
	  int count=0;
	  for(Customer c : cust) {
		  if(c.phone().equals(customer.phone()))
			  count++;
	  }
	  return count==1;
   }
   public double calculateBill(Customer customer)
   {
	  if(isFirstCustomer(customer))
	  {
		  return 0;
	  }
	  else if(customer.distance()<=4)
	  {
		  return 80;
	  }
	  else 
	  {
		  return 80+(6*customer.distance());
	  } 
   }
   public String printBill(Customer customer)
   {
	   return customer.customerName()+" Please pay your bill of Rs."+calculateBill(customer);
   }
   
   
   
   
   
}
