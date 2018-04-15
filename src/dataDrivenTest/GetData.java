package dataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetData {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://reg.ebay.in/reg/PartialReg?siteid=203&UsingSSL=1&co_partner"
				+"Id=2&errmsg=&src=&ru=https%3A%2F%2Fwww.ebay.in%2F&signInUrl=https%3A%2F%2Fsignin"
				+".ebay.in%3A443%2Fws%2FeBayISAPI.dll%3FSignIn%26ru%3Dhttps%253A%252F%252Fwww.ebay"
				+".in%252F&rv4=1");
	}
	
	@Test(dataProvider="getData")
	public void ebayRegistrationPageTest(String firstname, String lastname,String emailId, String password)
	{
		driver.findElement(By.cssSelector("input[name='firstname']")).clear();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.cssSelector("input[name='lastname']")).clear();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.cssSelector("input[id='email']")).clear();
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys(emailId);
		
		driver.findElement(By.cssSelector("input[name='password']")).clear();
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
