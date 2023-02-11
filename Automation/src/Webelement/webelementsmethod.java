package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsmethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email =driver.findElement(By.xpath("//input[@id='email'] "));
		// Sendkeys()
	email.sendKeys("vishal1234");
	Thread.sleep(2000);
	// Clear()
	email.clear();
	
	email.sendKeys("vishal123456");
	Thread.sleep(2000);
	//click()
	//driver.findElement(By.xpath("//button[@name='login']")).click();
WebElement	forgotten =driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]")); //get text()
System.out.println(forgotten.getText());//Forgotten password?
	Thread.sleep(9000);
	driver.quit();
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}