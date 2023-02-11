package testNG;


import static org.testng.Assert.assertNull;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test // assert equal 
	public void Test1() {
		Reporter.log("running test method",true);
		String expresult="good night";
		String actresult="good night";
		Assert.assertEquals(actresult, expresult,"act & exp result is not equal");
	}
	// Assert not equal
	@Test 
	public void test2() {
		Reporter.log("running test2 method",true);
		String expresult="good night";
		String actresult="good night1";
		Assert.assertNotEquals(actresult, expresult,"act & exp result is equal");
	}
	// assert true
	@Test
	public void test3() {
		Reporter.log("running test3 metnod",true);
		boolean expresult=true;
		Assert.assertTrue(expresult,"exp result is false");
	}
	@Test//assert false
	public void test4() {
		Reporter.log("running test3 metnod",true);
		boolean expresult=false;
		Assert.assertFalse(expresult,"exp result is true");
		
	}
	@Test// null
	public void test5() {
		Reporter.log("running test5 method",true);
		String expresult=null;
		Assert.assertNull(expresult, "exp result is not null");
		
	}
	@Test//not null
	public void test6() {
		Reporter.log("running test6 method",true);
		String expresult="vishal";
		Assert.assertNotNull(expresult, "exp result is null");
	
	}
	@Test//fail
	public void test7() {
		Reporter.log("running test7 method",true);
		Assert.fail();
	}
	
}
