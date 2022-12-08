package hybrid;



import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genric_p {
public static void getphoto(WebDriver  driver) throws IOException
{
	String p = "./photos/";
	Date d = new Date();
	String date = d.toString().replaceAll(":", "_");
  TakesScreenshot ts = (TakesScreenshot) driver;
  File src = ts.getScreenshotAs(OutputType.FILE);
  File dst = new File(p+date+".jpeg");
  org.openqa.selenium.io.FileHandler.copy(src, dst);
	
}
}
