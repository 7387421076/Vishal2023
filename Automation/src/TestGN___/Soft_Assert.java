package TestGN___;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

	//output:
		//java.lang.AssertionError: The following asserts failed:
		//	verification2 :act & expresult is not equal expected [good morning] but found [good night],
			// Vrification3 :result is false expected [true] but found [false]
	}
}
