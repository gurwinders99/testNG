import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Prioritisation {
	@BeforeSuite
	public void browserLaunch() {
		System.out.println("browserlaunch code");

	}
	@BeforeClass
	public void applicationLunch() {
		System.out.println("application launch code");
	}
	@Test(priority=1)
	public void loginwithvalidcred() {
		System.out.println("login with valid credentials  code");
	}
		@Test
		public void loginwithinvalidcred() {
			System.out.println("login with invalid credentials  code");








		}



}

