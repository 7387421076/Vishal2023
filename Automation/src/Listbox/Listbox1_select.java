package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1_select {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.navigate().to("https://www.facebook.com/");
      Thread.sleep(2000);
      
    
      driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[2]")).click();
      Thread.sleep(2000);
      
  WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
  Select s = new Select(day);
  
   s.selectByIndex(10);
     
     Thread.sleep(2000);
     driver.quit();
     
      
      

		
	}

}
