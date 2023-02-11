package pop;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbroswerpop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://skpatro.github.io/demo/links/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
	String idOfMainpage = driver.getWindowHandle();
	
	System.out.println(idOfMainpage);//CDwindow-526DFCFA51C2007CFB3E54974D42656F
	
	
	Set<String> ids = driver.getWindowHandles();
	
	ArrayList<String> al= new ArrayList<String>(ids);
	
	System.out.println(al.get(0));//main page
	System.out.println(al.get(1));// id of child page
	
	Thread.sleep(2000);
driver.quit();
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
