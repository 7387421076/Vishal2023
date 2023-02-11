package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class githubtest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      
	      
	      driver.navigate().to("https://github.com/");
	      Thread.sleep(2000);
	      Github_signIn signin= new Github_signIn(driver);
	      signin.clickGithubsignInButton();
	      Thread.sleep(6000);
	      Github_logIn login= new Github_logIn(driver);
	      login.setgithublogInusername();
	      login.setgithublogInpassword();
	      login.setgithublogInbtn();
	      
	      Github_home home =new Github_home(driver);
	      home.clickGithubhomelogoutBtn();
	      
	      Github_singout signout = new Github_singout(driver);
	      signout.clickGithubsignoutBtn();
	      Thread.sleep(3000);
	      driver.quit();
	      
	}

}
