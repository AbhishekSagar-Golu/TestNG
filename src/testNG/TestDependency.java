package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependency {
@Test
public void startApp()
{	Assert.assertEquals(0, 1);
	System.out.println("Start Application");
}
@Test(dependsOnMethods="startApp")
public void loginApp()
{
	System.out.println("Login to app");
}
@Test(dependsOnMethods="loginApp")
public void logoutApp()
{
System.out.println("Logout from App");	
}}
