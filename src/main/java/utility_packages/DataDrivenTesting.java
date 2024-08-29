package utility_packages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting 
{
	
public 	static String un1;
public static 	String pwdd;
public void credentials() throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\EKTA\\eclipse-workspace\\SeleniumProject\\DDT2\\project.xlsx");
	Workbook w1=WorkbookFactory.create(file);
	un1=w1.getSheet("learning").getRow(0).getCell(0).getStringCellValue();
	pwdd=w1.getSheet("learning").getRow(0).getCell(1).getStringCellValue();
	
	
}
}
