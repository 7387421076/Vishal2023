package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver Driver	= new ChromeDriver();
	
	Driver.manage().window().maximize();
	Driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	
	Driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("7387421076");
	Thread.sleep(3000);
	
	Driver.findElement(By.cssSelector("input[aria-label='Password'] ")).sendKeys("xyz");
	Thread.sleep(3000);
	
	Driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	Thread.sleep(9000);
	
	
	
		
}
}