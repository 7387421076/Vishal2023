package TestGN___;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {@Test
	public void TC4() {
	Reporter.log("runnig TC4 method",true);
}
@Test
public void TC5() {
	Reporter.log("runnig TC5 method",true);
}
@Test
public void TC6() {
	Assert.fail();
	Reporter.log("runnig TC6 method",true);
	
}



}
