package ie.lyit.Testers;

import ie.lyit.Hotel.Name;
import java.util.ArrayList;

public class NameTester 
{
	public static void main(String[] args)
	{
		//Create a Name object called personA
		Name personA = new Name();
		
		//display's personA details on screen
		System.out.println(personA);
		
		personA.setTitle("Mr");
		personA.setfirstName("Homer");
		personA.setSurname("Simpson");
		
		System.out.println(personA);
		
		//Creating Another object personB.
		Name personB = new Name("Mrs", "Marge", "Simpson");
		System.out.println(personB);
		
		if(personA.equals(personB))
			System.out.println(personA + " is the same as " + personB);
			else
				System.out.println(personA + " is NOT the same as "+ personB);
				
		if(personB.isFemale())
				System.out.println(personB + " is female");
		else 
				System.out.println(personB + " is not female");
	
	
	ArrayList<Name> names = new ArrayList<Name>();
	names.add(new Name("Mr","Bart","Simpson"));
	names.add(personA);
	names.add(personB);
	names.trimToSize( );
	
	for(Name tempName : names)
		System.out.println(tempName);
	
	
	if(nameSearch(personA,names))
		System.out.println("FOUND!");
	else
		System.out.println("NOT FOUND!");
	}
	
	public static boolean nameSearch(Name nameSearch, ArrayList<Name> listOfNames)
	{
		for (Name currentName:listOfNames)
			if(currentName.equals(nameSearch))
				return true;
	
		return false;
	}

}
