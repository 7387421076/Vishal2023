package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\excelsheet1\\excel1.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
	String data1= sh.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(data1);
	
	
	
	String data2 =sh.getRow(1).getCell(0).getStringCellValue();
System.out.println(data2);
	


 double data3 =sh.getRow(0).getCell(1).getNumericCellValue();
 System.out.println(data3);
 
 int d3= (int)data3;
 System.out.println(d3);
 
 boolean data4= sh.getRow(0).getCell(2).getBooleanCellValue();
 System.out.println(data4);
 

  String data5 = sh.getRow(1).getCell(1).getStringCellValue();
  System.out.println(data5);
  
  // String data6 = sh.getRow(1).getCell(2).getStringCellValue();
  //System.out.println(data6);
  
  int rowsize=sh.getLastRowNum();
  System.out.println(rowsize);
  
   short cellsize = sh.getRow(0).getLastCellNum();
  System.out.println(cellsize);
	}

}
