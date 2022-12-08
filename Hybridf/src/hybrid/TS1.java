package hybrid;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS1 extends Base_class {
@Test
public void script() throws EncryptedDocumentException, IOException
{
 String un = Genericexcel.getData("Sheet1", 0, 0);
  String pwd = Genericexcel.getData("Sheet1", 1, 0);
  POM1 p = new POM1(driver);
    p.email(un);
    p.pass1(pwd);
    Assert.fail();
    
    
  
    
}
}
