package DDE_POM_TestNG_Baseclass_utilityclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	private static final String Utility = null;
	static  WebDriver drivr;
	public static void openbrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.navigate().to(Utilityclass.getpropertyFileDataString("url"));
	      
	      

	}

}
