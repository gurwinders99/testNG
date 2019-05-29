import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DependsonMethodDemo {
	
	public static WebDriver driver;
	@Test
	public void launchbrowser() {
		
		String driverpath=System.getProperty("user.dir")+"\\src\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver= new ChromeDriver();
		driver.get("https://github.com/mozilla/geckodriver/releases");		
		
		
	}
	@Test(dependsOnMethods="launchbrowser")
	public void clickonSignUp() {
		driver.findElements(By.xpath("//a[contains(@href,'/join?source=header-repo')]")).get(1).click();
	}
	@Test(dependsOnMethods="clickonSignUp")
	public void clickonSignIn() {
		driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
	}

	//@Test(dependsOnMethods="clickonSignIn")
	//public void closeBrowser() {
		//driver.close();
		
	}

