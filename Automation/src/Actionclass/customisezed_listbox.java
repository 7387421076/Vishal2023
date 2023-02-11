package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customisezed_listbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(9000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month'] "));
		Actions act=new Actions (driver);//keyboard can interact with browser with the help action class
		
		act.click(month).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
