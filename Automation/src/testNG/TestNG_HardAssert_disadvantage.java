package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNG_HardAssert_disadvantage {
	//@Test
	public void test() {
		String expResult="good morning";
		String actResult="good ";
		boolean result= true;
		
		//verification 1
		Assert.assertNotEquals(actResult, expResult,"act & exp result equal");
		
	
		//verification2
	Assert.assertEquals(actResult, expResult,"act and exp resutl is not equal");
		
		//verification3
		
		Assert.assertTrue(result,"Result is false"); 
	}

}

