package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;//every Action execution used perform

public class Action_ {// Action class used to mouse over
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
	
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
