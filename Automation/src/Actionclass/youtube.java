package Actionclass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disble-Notification)");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("maharaj");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='search']")));
		
		
		
		
		driver.quit();
		
		
	}

}
