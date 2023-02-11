package DDE_POM_TestNG_Baseclass_utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_singout {
	@FindBy(xpath="//button[contains(text(),'Sign out')] ") private WebElement signoutBtn;
	
	public Github_singout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void clickGithubsignoutBtn() {
	signoutBtn.click();
	
	
}
}
