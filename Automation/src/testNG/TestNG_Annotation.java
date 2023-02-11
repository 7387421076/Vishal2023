package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {//annotation- used to control the flow of methods in test class 
@BeforeClass
public void openBrowser() {// open browser
	
	
}
	@BeforeMethod
		public void login() {//login 
		
	}
	@Test
	public void verifyUN() {
		
	}
	@Test
	public void cerifyPWD() {
		
	}
	@AfterMethod
	public void logout() {// logout
		
		
	}
	@AfterClass
	public void clsoedBrowser() {//closed browser
		
	}
}
