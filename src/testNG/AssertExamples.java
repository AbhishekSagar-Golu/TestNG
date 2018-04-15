package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExamples {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(12, 13);
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test 2 started");
		Assert.assertEquals(1, 2,"Data does not match check with the developer");
		System.out.println("Test 2 ended");
	}
	@Test
	public void test3()
	{
		System.out.println("Test 3 started");
		Assert.assertEquals("Hello", "Hello", "data matches so it WAD");
		System.out.println("Test 3 ended");
	}
	
	@Test
	public void test4()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test5()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void test6()
	{
		String obj = "Simon tuffol";
		Assert.assertTrue(obj.contains("tuhjff"),"Abhi");	// if given substring is F then
		// Abhi is seen it output console
	}
		
	}
	


