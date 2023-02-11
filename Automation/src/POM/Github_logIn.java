package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_logIn {
	@FindBy(xpath="//input[@name='login']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy (xpath="//input[@type='submit']")private WebElement signInbtn;
	
	public Github_logIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void setgithublogInusername() {
		UN.sendKeys("vishalpabale94@gmail.com");
		
	}
public void setgithublogInpassword() {
	PWD.sendKeys("vishal123@##@");
}
public void setgithublogInbtn() {
	signInbtn.click();
}
}