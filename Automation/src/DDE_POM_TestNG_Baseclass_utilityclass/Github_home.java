package DDE_POM_TestNG_Baseclass_utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_home {
	@FindBy(xpath="(//summary[@class='Header-link'] )[2]")private WebElement logoutBtn;
	@FindBy (xpath="//strong[contains(text(),'7387421076')]")private WebElement UserName;
	public Github_home(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
	public void clickGithubhomelogoutBtn() throws InterruptedException {
		logoutBtn.click();
		Thread.sleep(5000);
		
		
	}
	public String verifyGithubhomePageUN() {
	String actresult = UserName.getText();
	return actresult;
		
	}

}
