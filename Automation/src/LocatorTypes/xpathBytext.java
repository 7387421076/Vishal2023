package LocatorTypes;

import java.awt.desktop.QuitEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathBytext {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webriver.chrome.driver", "\"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.quit(); 
		
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		driver.findElement(By.xpath("//div[contains(text(),'Beauty')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Top')])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
