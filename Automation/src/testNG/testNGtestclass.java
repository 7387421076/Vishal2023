package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNGtestclass {
	@Test
	public void TC1 () {
		System.out.println("Quantum academy");
		Reporter.log("quantum academy");// msg will be displayed on report only
		Reporter.log("quantum academy",false);//msg will be displayed on report only
		Reporter.log("Quantumacademy",true);// msg will be displayed on report and console
	}

}
