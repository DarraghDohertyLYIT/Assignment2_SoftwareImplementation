package ie.lyit.Hotel;

public abstract class Person 
{
	protected Name name;
	protected String address;
	protected String phoneNumber;
	
	public Person()
	{
		name=new Name();
		address=null;
		phoneNumber=null;
	}
	
	public Person(String t, String fN, String sN, String address, String phoneNumber)
	{
		name = new Name(t, fN, sN); // default constructor shows that name is an object and must take in parameters.
		this.address=address; // as seen above, address and phoneNumber have been set to null therefore we are assigning
							  // both these to the same as in the default constructor.
		this.phoneNumber=phoneNumber;
		
	}
	
	public String toString()
	{
		return ("Name: " + name + "/nAddress:  " + address + "/nPhone Number: " + phoneNumber);
		/* can also use, return name + "," + address + "," + phoneNumber;
		 * 
		 */
	}
	@Override
	public boolean equals(Object obj)
	{
		Person pObject; //create a comparison object of Person.
		if (obj instanceof Person) //if obj is in Person 
			pObject = (Person)obj; //assigns obj to pObject
		else
			return false;
		
		return(name.equals(pObject.name) && 
				address.equals(pObject.address) &&
				phoneNumber.equals(pObject.phoneNumber)); // ALL TRUE..
	}
	
	//setters and getters methods.
	public void setName(Name nameIn)
	{
		name = nameIn;
	}
	
	public Name getName()
	{
		return name;
	}
	
	public void setAddress(String addressIn)
	{
		address= addressIn;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setPhoneNumber(String phoneIn)
	{
		phoneNumber = phoneIn;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
}


