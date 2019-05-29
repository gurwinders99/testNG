import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="smoke")
	public void smokeTestCase1() {
		System.out.println("smoke testcase 1");
	}
	@Test(groups="smoke")
	public void smokeTestCase2() {
		System.out.println("smoke testcase 2");

	}
	@Test(groups="sanity")
	public void sanityTestCase1() {
		System.out.println("sanity testcase 1");
	}
		@Test(groups="sanity")
		public void sanityTestCase2() {
			System.out.println("sanity testcase 2");
		}
		
		
		@Test(groups="functional")
		public void functionalTestCase1() {
			System.out.println("functional testcase 1");
		}
		@Test(groups="functional")
		public void functionalTestCase2() {
			System.out.println("functional testcase 2");
		}
		
		
		@Test(groups= {"functional","smoke"})//curly brackets is for only multiple groups 
		public void functionalAndSmokeTestCase() {
			System.out.println("fuctional and smoke testcase ");
		}

		@Test(groups= {"sanity,smoke"})
		public void SanityAndSmokeTestCase() {
			System.out.println("Sanity and smoke testcase ");
	
	
	
	}
}
	
	
	
	
	
	
	
