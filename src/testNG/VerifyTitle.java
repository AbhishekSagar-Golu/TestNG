package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
@BeforeClass			//Important
public void startBrowser()
{	driver = new FirefoxDriver();
	System.out.println("Start Browser");
}
	@Test
	public void verifyAppTitle()
	{
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();
		System.out.println("Title is " +title);
		String expected_Title="Google";
		//Assert.assertEquals(title, expected_Title);
		//System.out.println("Google title");// this ll executed only when the test case passes
		//i.e actual=expected
		Assert.assertTrue(title.contains("Goo"));//to check the specific part(Partial part) of title, we can use below
		System.out.println("Google title, Page verified");
		//driver.close();
	}
@AfterClass
public void closeBrowser()
{
	driver.close();
}

}
 