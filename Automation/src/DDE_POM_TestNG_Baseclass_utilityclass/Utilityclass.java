package DDE_POM_TestNG_Baseclass_utilityclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilityclass {
	public static String getTestData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\oct_selenium\\Testdata\\excel1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("github");
	String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		
		return value;
		
	}
public static String getpropertyFileDataString(String Key) throws IOException {
	Properties obj = new Properties();
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\\\url.properties");
	obj.load(file);
String value = obj.getProperty(Key);
	return Key;
	
}
}
