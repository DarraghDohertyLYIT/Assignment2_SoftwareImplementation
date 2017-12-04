package ie.lyit.Hotel;

public class Name 
{
	private String title;
	private String firstName;
	private String surname;
	
	public Name()
	{
		title=firstName=surname=null;	//assigning all to null
	}
	
	public Name(String t , String fN, String sN)
	{
		this.title=t;
		this.firstName=fN;
		this.surname=sN;
	}
	
	public String toString()
	{
		return title + " " + firstName + " " + surname; 
	}
	
	public boolean equals(Object obj)
	{
		Name nObject;
		if(obj instanceof Name)
			nObject=(Name)obj;
		else
				return false;
		
		return this.title.equals(nObject.title)
				&& this.firstName.equals(nObject.firstName)
				&& this.surname.equals(nObject.surname);
	}
	public void setTitle(String setTitleTo)
	{
	this.title=setTitleTo;	
	
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setfirstName(String setFirstNameTo)
	{
		this.firstName=setFirstNameTo;
	}
	
	
	public String getfirstName()
	{
		return firstName;
	}
	
	public void setSurname(String setSurnameTo)
	{
		this.surname=setSurnameTo;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public boolean isFemale()
	{
		if(title.equalsIgnoreCase("Miss") ||
				title.equalsIgnoreCase("Mrs") ||
				title.equalsIgnoreCase("Ms"))
					return true;
				else 
					return false;
	}
	
	
	
}