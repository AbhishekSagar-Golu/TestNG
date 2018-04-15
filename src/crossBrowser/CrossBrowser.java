package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.Killable;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
WebDriver driver;

@Parameters("browser")
@Test
public void verifyTitle(String browserName)
{
	if(browserName.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
			}
	else if(browserName.equalsIgnoreCase("chrome"))
		{
		driver= new ChromeDriver();
		}
	else
	{
		System.out.println("---------invalid browser name, provide correct browser name");
	}
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.get("https://www.google.com");
 System.out.println(driver.getTitle());
 driver.quit();
 // for IE, use WindowsUtils.killByName();

}
		}
