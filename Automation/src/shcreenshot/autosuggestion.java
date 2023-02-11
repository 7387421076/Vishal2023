package shcreenshot;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		String expresult = "realme 9 pro";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("realme");
		Thread.sleep(9000);
	 List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement option:alloptions) {
		String actresult = option.getText();
		if (actresult.equals(expresult)) {
			option.click();
			break;
			
			
		}
		}
		
		Thread.sleep(9000);
		driver.quit();
		
		
	} 

}
