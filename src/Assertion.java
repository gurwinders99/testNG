import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
		@Test
		public void hardAssertion() {
			System.out.println("execution start");
			String expectedTitle = "Facebook";
			String actualTitle = "Facebok";
			
			
//			if(expectedTitle.equals(actualTitle)) {//instead of using if else condition we use assertion method 
//				System.out.println("yes");
//			}else
//				System.out.println("no");
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("execution end");
		}

		@Test
		public void softAssertion() {
			SoftAssert sa = new SoftAssert();
			System.out.println("execution start");
			String expectedTitle = "Facebook";
			String actualTitle = "Facebok";
			sa.assertEquals(actualTitle, expectedTitle);
	
//			if(expectedTitle.equals(actualTitle)) {//instead of using if else condition we use assertion method 
//				System.out.println("yes");
//			}else
//				System.out.println("no");
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("execution end");
			sa.assertAll();
		}




}
