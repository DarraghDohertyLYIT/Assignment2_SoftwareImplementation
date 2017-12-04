package ie.lyit.serialize;

import java.util.ArrayList;
import ie.lyit.Hotel.Customer;
import ie.lyit.Testers.CustomerTester1;


import java.io.*;
import java.util.*;


public class CustomerSerializer extends Customer
{

	
	
		private final String FILENAME = "customer.ser";	
		private ArrayList<Customer> custList;
		
		public CustomerSerializer()
		{
			custList = new ArrayList<Customer>();
			
		}
		
		public void add()
		{
			Customer customer = new Customer(); //creates a Customer
			//customer.read(); // calls on its read method
			custList.add(customer); // adds the customer to the custList (known in this case as the ArrayList of this java class)
		}
		
		
		public Customer view(){
			Scanner keyboardIn = new Scanner(System.in);		
			
			// Read the number of the Customer to be viewed from the user
			System.out.println("ENTER NUMBER OF Customer : ");
			int CustomerToView=keyboardIn.nextInt();
			
			// for every Customer object in Customers
		    for(Customer tmpCustomer:custList)
		    {
			   // if it's number equals the number of the CustomerToView
			   if(tmpCustomer.getNumber() == CustomerToView){
			      // display it
				  System.out.println(tmpCustomer);
				  return tmpCustomer;
			   }
			}
		    // if we reach this code the Customer was not found so return null
		    return null;		
		}

		public void delete(){	
			// Call view() to find, display, & return the Customer to delete
			Customer tempCustomer = view();
			// If the Customer != null, i.e. it was found then...
		    if(tempCustomer != null)
			   // ...remove it from Customers
		       Customer.remove(tempCustomer);
		}
		
	
		public void edit(){	
			// Call view() to find, display, & return the Customer to edit
			Customer tempCustomer = view();
			// If the Customer != null, i.e. it was found then...
		    if(tempCustomer != null){
			   // get it's index
			   int index=Customer.indexOf(tempCustomer);
			   custList.set(index, tempCustomer);
		    }
			   // read in a new Customer and...
			   Customer.read();
			   // reset the object in Customers
			  // Customer.set(index, tempCustomer);
		    }
		    
		    public void list(){
				// for every Book object in books
		        for(Customer tmpCustomer:custList)
					// display it
					System.out.println(tmpCustomer);
			}
			

		    
		 // This method will serialize the books ArrayList when called, 
			// i.e. it will write it to a file called books.ser
			public void writeRecordsToFile(){
				ObjectOutputStream os=null;
				try {
					// Serialize the ArrayList...
					FileOutputStream fileStream = new FileOutputStream(FILENAME);
				
					os = new ObjectOutputStream(fileStream);
						
					os.writeObject(custList);
				}
				catch(FileNotFoundException fNFE){
					System.out.println("Cannot create filt to store a new Customer.");
				}
				catch(IOException ioE){
					System.out.println(ioE.getMessage());
				}
				finally {
					try {
						os.close();
					}
					catch(IOException ioE){
						System.out.println(ioE.getMessage());
					}
				}
			}

			// This method will deserialize the books ArrayList when called, 
			// i.e. it will restore the ArrayList from the file books.ser
			public void readRecordsFromFile(){
				ObjectInputStream is=null;
				
				try {
					// Deserialize the ArrayList...
					FileInputStream fileStream = new FileInputStream(FILENAME);
				
					is = new ObjectInputStream(fileStream);
						
					custList = (ArrayList<Customer>)is.readObject();	
				}
				catch(FileNotFoundException fNFE){
					System.out.println("Cannot create file to store Customers.");
				}
				catch(IOException ioE){
					System.out.println(ioE.getMessage());
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				finally {
					try {
						is.close();
					}
					catch(IOException ioE){
						System.out.println(ioE.getMessage());
					}
				}
			}
		}


		

		
		
	



