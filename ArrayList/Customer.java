package com.asif.collection_arraylist_scenario19_08;

public record Customer(int custId,String customerName,String pickupLocation,String dropLocation,int distance,String phone)
{
   public Customer
   {
	   if(custId<0)
	   {
		   throw new IllegalArgumentException("Id cant be negative");
	   }
	   else if(customerName ==null ||customerName.isBlank())
	   {
		   throw new IllegalArgumentException("Name can't be null and empty");
	   }

	   else if(pickupLocation ==null ||pickupLocation.isBlank())
	   {
		   throw new IllegalArgumentException("pickup location can't be null and empty");
	   }

	   else if(dropLocation ==null ||dropLocation.isBlank())
	   {
		   throw new IllegalArgumentException("drop location can't be null and empty");
	   }

	   else if(distance<=0)
	   {
		   throw new IllegalArgumentException("distance can't be negative or zero.");
	   }

	   else if(phone ==null ||phone.isBlank())
	   {
		   throw new IllegalArgumentException("phone number can't be null and empty");
	   }
	   
	   
	   
   }
}
