package DDE_POM_TestNG_Baseclass_utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_signIn {
	@FindBy(xpath="//a[contains( text(),'Sign in')]")private WebElement signIn;
	
	public Github_signIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickGithubsignInButton() {
		signIn.click();
		
	}
}
