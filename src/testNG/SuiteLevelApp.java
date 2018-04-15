


////Implementation done on the basis of class Level
package testNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteLevelApp {
	WebDriver driver;
	@Test  
	public void googleTitleVerify()
	{
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		}
	@Test
	public void titleMatch()
	{
		System.out.println("TestCase demo 2");
		Assert.assertFalse(true);
	}
}
