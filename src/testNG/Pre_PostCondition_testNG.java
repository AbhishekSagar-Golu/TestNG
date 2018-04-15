package testNG;

import javax.jws.soap.SOAPBinding;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Pre_PostCondition_testNG {
@BeforeSuite
public void beforeSuit()
{
	System.out.println("Running before suite");
}
@AfterClass
public void afterClass()
{
	System.out.println("Running after class");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("Running before method");
}
@Test
public void test()
{
	System.out.println("running Test");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("Running before class");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("running after method");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("Running After Suite");
}
}
