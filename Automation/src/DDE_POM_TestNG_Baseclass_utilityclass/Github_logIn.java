package DDE_POM_TestNG_Baseclass_utilityclass;

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
	
	public void setgithublogInusername(String UserName) {
		UN.sendKeys("UserName");
		
	}
public void setgithublogInpassword(String Password) {
	PWD.sendKeys("password");
}
public void setgithublogInbtn() {
	signInbtn.click();
}
}