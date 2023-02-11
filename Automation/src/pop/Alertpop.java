package pop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
      driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
      
      driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1");
      
      Thread.sleep(1000);
      
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      Thread.sleep(1000);
      
    Alert alt = driver.switchTo().alert();
    System.out.println(alt.getText());
    alt.accept();
  //  alt.dismiss();
  Alert alt1 = driver.switchTo().alert();
  System.out.println(alt1.getText());
  alt1.accept();
	
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
