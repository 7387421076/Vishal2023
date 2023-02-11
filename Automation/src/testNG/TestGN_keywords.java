

package testNG;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGN_keywords {
	
	//1.invocation count
	@Test  (priority = 1)//(invocationCount = 3,enabled=false)
	public void TC1() {
		
		Reporter.log("running TC1",true);

	}
	//2. enabled
	@Test(priority = 0)
	public void TC2() {
		Assert.fail();
		Reporter.log("running TC2",true);
	}
@Test(priority = 3)
public void TC3() {
Reporter.log("running TC3",true);

}
//3.priority
// 4.Timeout 
//5.dependent on method 

@Test(timeOut = 3000,dependsOnGroups = {"TC1","TC2"})
public void TC4() throws InterruptedException {
	Reporter.log("running tc4",true);
 	Thread.sleep(4000);
}

}




