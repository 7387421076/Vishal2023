package DDE_POM_TestNG_Baseclass_utilityclass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class githubtest extends baseclass {
	Github_home home;
	Github_logIn login;
	Github_signIn signin;
	Github_singout signout;
	
	
	@BeforeClass
	public void browseropen() throws IOException {
		openbrowser();
		signin =new Github_signIn(drivr);
		login = new Github_logIn(drivr);
		home= new Github_home(drivr);
		signout = new Github_singout(drivr);
		
		
	}

	      @BeforeMethod
	      public void login() {
	    	  login.clickGithubsigninbutton();
	      }
	      @Test
	      public void test() {
	    	  
	    	  
	      }
	      @AfterMethod
	      public void logout() {
	    	  
	      }
	      @AfterClass
	      public void closeBrowser() {
	    	  
	      }
	}


