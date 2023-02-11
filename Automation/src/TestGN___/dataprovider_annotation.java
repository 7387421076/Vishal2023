package TestGN___;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_annotation {
	@DataProvider(name="data-privider")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"Automation testing"},{"SQL"}};
		
	}
	@Test(dataProvider = "data-provider")
	public void TC1(String value){
		System.out.println(value);
	}
}
