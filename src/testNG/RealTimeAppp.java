
package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RealTimeAppp {
	WebDriver driver;
	
	@Test
	public void startApp()
	{
		new ChromeDriver();
		driver.navigate().to("https://www.speedtest.net/login");
		//driver.navigate("https://www.speedtest.net/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String currentUrl=driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("login"));
	}
	@Test(dependsOnMethods="startApp")
	public void login()
	{
		driver.findElement(By.cssSelector("input[name='login-email']")).sendKeys("duosabhi@gmail.com");
		driver.findElement(By.cssSelector("input[name='login-password']")).sendKeys("gobabygo@25");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
