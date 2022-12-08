package hybrid;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genricsript.framework;

public class Base_class implements framework {
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty(key, value);
    driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("url");	
}
@AfterMethod
public void closeapp(ITestResult result) throws IOException
{
if (ITestResult.FAILURE==result.getStatus())	
{
Genric_p.getphoto(driver);	
}
driver.close();
}
}
