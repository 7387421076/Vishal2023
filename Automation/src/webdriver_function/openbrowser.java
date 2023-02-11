package webdriver_function;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();//
	driver.manage().window().maximize();//
	driver.navigate().to("https://www.flipkart.com/");//
	Thread.sleep(1000);//
	driver.navigate().to("https://www.amazon.in/s?k=amazon+sign&i=electronics&adgrpid=59527504272&ext_vrnc=hi&gclid=EAIaIQobChMItv3ao9Hu-wIVVlZgCh3yowqwEAAYASAAEgIzqvD_BwE&hvadid=597352931660&hvdev=c&hvlocphy=1007788&hvnetw=g&hvqmt=b&hvrand=17302971245788984968&hvtargid=kwd-365111317397&hydadcr=19941_2255885&tag=googinhydr1-21&ref=pd_sl_43b97jzn5c_b");
driver.navigate().back();//
driver.navigate().forward(); //
driver.navigate().back();//
driver.navigate().refresh();//

Dimension d= new Dimension(500,20);
driver.manage().window().setSize(d);
Thread.sleep(4000);
Point p= new Point(200,300);
	driver.manage().window().setPosition(p);
	Thread.sleep(4000);
	driver.quit();
	
	
	
	
	
	
	}

}