package hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
@FindBy(id="email")
private WebElement email_id;
@FindBy(id="pass")
private WebElement pass1;
@FindBy(name="login")
private WebElement lgnbtn;
public POM1 (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void email(String user)
{
	email_id.sendKeys(user);
}
public void pass1(String pass)
{
	pass1.sendKeys(pass);
}
}
