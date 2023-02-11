package shcreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class screenshot_ {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 System.out.println(src);//C:\Users\ADMIN\AppData\Local\Temp\screenshot3793266041212855626.png
 
 String random=RandomString.make(5);
File dest= new File("C:\\Users\\ADMIN\\Desktop\\screenshots\\facebook_"+random+".png");
 org.openqa.selenium.io.
 FileHandler.copy(src, dest);
 
	Thread.sleep(2000);
driver.quit();

	
	 
	
	 

	
	
	
	
	
	
	
	}
}
