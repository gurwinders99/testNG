import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	WebDriver driver;
	@Test
	public void alaunchBrowser() {
		String driverPath= System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		 driver= new ChromeDriver();
	}
	
	@Test//(enabled=false)this enabled =false means to ignore some testcases 
	public void blaunchApp() {
		driver.get("https:www.facebook.com/");
	}
	
	@BeforeMethod//it will launch before each @test cases
	public void beforeMethodAnn() {
		System.out.println("before method annotation");
		
	}
	@AfterMethod
	public void afterMethodAnn() {
		System.out.println("after method annotation"); 

	}
	@BeforeClass//to call a class before any before method 
	public void beforeClassAnn() {
		System.out.println("before class annotation");
		
	}
	@AfterClass//to call the class after in the end 
	public void afterClassAnn() {
		System.out.println("after class annotation");
			}
	@BeforeTest//it will execute once and execute before class
	public void beforeTestAnn() {
		System.out.println("before test annotation");
		
	}
	
	@AfterTest
	public void afterTestAnn() {
		System.out.println("After test annotation");
		
	}
	@BeforeSuite
	public void BeforeSuiteAnn() {
		System.out.println("before suite annotation");
		
	}
	
	@AfterSuite
	public void AfterSuiteAnn() {
		System.out.println("after suite annotation");
	}
	
	
	
	
	
	
	
	
	
}
