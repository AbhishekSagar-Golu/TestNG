package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class RealTime_Yatra {
	WebDriver driver;
	@Test
	public void startApp()
	{
	//driver= new ChromeDriver();
	driver= new FirefoxDriver();
	driver.navigate().to("https://www.yatra.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.linkText("My Account"));
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	//driver.findElement(By.cssSelector("input[name='login-input']")).sendKeys("duosabhi@gmail.com",Keys.ENTER);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement login=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Login')]")));
	login.click();//String currentUrl=driver.getCurrentUrl();
	//Assert.assertTrue(currentUrl.contains("login"));
}
@Test(dependsOnMethods="startApp")
public void login() throws InterruptedException
{	
	WebElement loginInput =driver.findElement(By.cssSelector("input[name='login-input']"));
	loginInput.sendKeys("duosabhi@gmail.com", Keys.ENTER);
	//driver.findElement(By.cssSelector("input[name='login-email']")).sendKeys("duosabhi@gmail.com");
	//driver.findElement(By.id("login-continue-btn")).click();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='login-input']")));
	WebElement pwd= driver.findElement(By.cssSelector("input[id='login-password']"));
	pwd.sendKeys("gobabygo@25", Keys.ENTER);
	//driver.findElement(By.linkText("Login")).click();
	//driver.close();

}
@AfterClass   //benefits: if above test annotations execute or not, below method get executed
public void classApp()
{
	driver.close();
}
}
