package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft__assert {
	@Test
	public class Soft_Assert {
		public void test() {
			String expResult="good morning";
			String actResult="good night";
			boolean result=false;
			SoftAssert soft = new SoftAssert();
			//verification1
			
			soft.assertNotEquals(actResult, expResult,"verification1:act and exp result is equal");
			// verification2
			soft.assertEquals(actResult, expResult, "verification2 :act & expresult is not equal");
			//verification3
			soft.assertTrue(result, " Vrification3 :result is false");
			soft.assertAll();


}
}}