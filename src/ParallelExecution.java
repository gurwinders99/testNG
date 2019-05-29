import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	@Test
	@Parameters("browser")//for passing parameters from outside(XML FILE)
	public void launchBrowser() {
		String driverpath=System.getProperty("user.dir")+"\\Browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver= new ChromeDriver();
		
		String driverpath1=System.getProperty("user.dir")+"\\Browser_drivers\\operadriver.exe";
		System.setProperty("webdriver.opera.driver",driverpath1);
		WebDriver driver1= new OperaDriver();
		
	}

//		driver.get("https://.....");
//
//@Test
//public void voidclickelement(){
//	driver.findElement();
		
}



