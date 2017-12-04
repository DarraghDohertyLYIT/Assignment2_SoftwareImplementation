package ie.lyit.Testers;

import ie.lyit.Hotel.Customer;
import ie.lyit.Hotel.Name;
import ie.lyit.Testers.CustomerTester1;

public class CustomerTester1 extends Customer {

	public static void main(String[] args) {
		// Create a Customer object called customerA
		Customer customerA = new Customer();
		System.out.println(customerA);
		
		customerA.setName(new Name("Mr", "Darragh", "Doherty"));
		customerA.setPhoneNumber("087-1234567");
		customerA.setEmailAddress("DD@LyIT.ie");
		
		System.out.println(customerA);
		
		Customer customerB = new Customer("Mr","Joe","Byrne","087123124","JB@JB.ie", null);
		System.out.println(customerB);
		
		// check if customerA is the same as customerB
				if(customerA.equals(customerB))
					System.out.println(customerA + " is the same customer as " + customerB);
				else
					System.out.println(customerA + " is not the same customer as " + customerB);
							
				// check if customerB is female
				if(customerB.getName().isFemale())		
					System.out.println(customerB.getName() + " is female.");			
				else
					System.out.println(customerB.getName() + " is male.");
				

		
		Customer.read();
		
	}		
}

