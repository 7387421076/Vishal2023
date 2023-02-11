package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop_ {// Build  is used to if multiple action in single line //release used to drop the value    
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new  ChromeDriver();
			
			driver.manage().window().maximize();
			driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
			
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			Thread.sleep(2000);
			
		 WebElement dest = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		 
		 Actions act= new Actions(driver);
		 
		 //act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		 act.dragAndDrop(src, dest).perform();
		 Thread.sleep(2000);
		 driver.quit();
		}
	}

