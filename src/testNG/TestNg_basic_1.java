package testNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;// test is a class

public class TestNg_basic_1 {
	@Test
	public void loginApplication()
	{
		System.out.println("Login to application");
		Assert.assertEquals(12, 13); //assert is a class Present in testng Package
	}
	@Test
	public void selectItems()
	{
		System.out.println("Item Selection");
	}
	@Test
	public void checkOut()
	{
		System.out.println("Checkout Completed");
	}
// If we are not setting Priority, it executes annotations based on
// alphabetical order of method name
	
	@Test(priority=-1,description="This test case ll verify login functionality")
	//he description for this method. The string used will appear in the HTML report
	//and also on standard output if verbose >= 2.
	public void loginApplication_1()
	{
		System.out.println("Login to application_1");
	}
	@Test(priority= 1,description="This testcase ll add certain items in basket")
	public void selectItems_1()
	{
		System.out.println("Item Selection_1");
	}
	@Test(priority = 7, description="This testcase ll perform checkout operation")
	public void checkOut_1()
	{
		System.out.println("Checkout Completed_1");
	}
//if priority order has some +ve integer values than non priority 
	//annotations ll get executed first
	}
