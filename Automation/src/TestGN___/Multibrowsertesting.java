package TestGN___;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowsertesting {
	@Parameters("browserName")
	@Test
	public void TC1(String browserName){
		WebDriver driver =null;
		
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
	}else if (browserName.equals("firfox")) {
		System.setProperty("webdriver.gecko.driver","firfox.exe");
		
	}else if(browserName.equals("ie")) {
		System.setProperty("webdriver.ie.driver", "ie.exe");
		
	}
	}

}
