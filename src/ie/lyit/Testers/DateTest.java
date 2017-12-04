package ie.lyit.Testers;

import ie.lyit.Hotel.Date;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTest {
	private Date d1 , d2;

	@Before
	public void setUp() throws Exception
	{
		d1=new Date();
	}
	
	@Test
	public void testDate()
	{
		assertEquals(d1.getDay(),0);
		assertEquals("Month should be 0" + d1.getMonth(),0);
		assertEquals("Year should be 0" + d1.getYear(),0);
	}

	@Test
	public void testSetDay() 
	{
		d1.setDay(21);
		assertEquals(d1.getDay(),21);
	}

	@Test
	public void testSetMonth() 
	{
		d1.setMonth(17);
		assertEquals(d1.getMonth(),17);
	}

	@Test
	public void testSetYear() 
	{
		d1.setYear(2017);
		assertEquals(d1.getYear(),2017);
	}
	

}

