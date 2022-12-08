package genricsript;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./soft/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Date d=new Date();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    Thread.sleep(2000);
	    File src = ts.getScreenshotAs(OutputType.FILE);
	      File dst = new File("C:\\ss\\ss.jpeg");
	      FileUtils.copyFile(src, dst);       

	}
	
	}


