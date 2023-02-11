 package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {
	public class Action_ { // context used to perform right click
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.flipkart.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);
			
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
			
		Actions act = new Actions(driver);
		act.contextClick(login).perform(); 
			Thread.sleep(2000);
			driver.quit();
			
		}

	}


}
