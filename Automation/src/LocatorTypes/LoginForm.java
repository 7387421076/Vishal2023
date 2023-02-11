package LocatorTypes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.cromedriver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
	  driver.manage().window().maximize();
	  driver.navigate().to("file:///C:/Users/ADMIN/Downloads/html/login%20From1.html");
	  Thread.sleep(2000);
	  driver.quit();
	  
	}
}
