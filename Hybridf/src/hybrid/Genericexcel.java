package hybrid;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Genericexcel {
public static String getData(String Sheet, int row, int cell) throws EncryptedDocumentException, IOException
{
     FileInputStream fil = new FileInputStream("./excel/excel12.xlsx");
     Workbook book = WorkbookFactory.create(fil);
         org.apache.poi.ss.usermodel.Sheet sh1 = book.getSheet("Sheet1");
       Cell cel = sh1.getRow(row).getCell(cell);
       String v = cel.getStringCellValue();
       return v;
    
   
}
}
