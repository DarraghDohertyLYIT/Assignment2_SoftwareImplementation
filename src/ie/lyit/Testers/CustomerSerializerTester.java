package ie.lyit.Testers;

import java.util.Scanner;

public class CustomerSerializerTester {
   private int option;
   
   public void display(){
     System.out.println("||\t1. Add||");
	 System.out.println("||\n\t2. List||");
	 System.out.println("||\n\t3. View||");
	 System.out.println("||\n\t4. Edit||");
	 System.out.println("||\n\t5. Delete||");
	 System.out.println("||\n\t6. Quit||");		
   }
	
   public void readOption()
   {
      Scanner keyboardIn = new Scanner(System.in);
  	  System.out.println("\n\tEnter Option [1|2|3|4|5|6]");
   	  option=keyboardIn.nextInt();
   }
					
	public int getOption(){
	   return option;
	}	
	
	
}
