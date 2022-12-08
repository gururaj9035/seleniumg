package genricsript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements framework {

	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		
		System.setProperty(key,value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod
	public void closeapp()
	{
		
		driver.close();
	}
}
