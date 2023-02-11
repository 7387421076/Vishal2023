package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_isenbled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://en-gb.facebook.com/");
	Thread.sleep(2000);
	//isEnabled
WebElement link =driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
	System.out.println(link.isEnabled()); // true
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
