import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartModel {
	public static void main(String[] args) {
		//String driverpath =D:\ECLIPSE FILES\WebDriverProject\src\Browser_Drivers\chromedriver.exe//absolute path of a particular file
		
		String driverpath = System.getProperty("user.dir")+"\\src\\chromedriver.exe";//relative path of a project
		System.setProperty("webdriver.chrome.driver",driverpath);//built in property to launch the browser
		WebDriver driver = new ChromeDriver();//or firefoxDriver
		
		//to launch an application
		driver.get("https://www.flipkart.com/");
	driver.findElements(By.xpath("email")).get(2).sendKeys("9958063443");//if we need to enter data in the field we use "sendkeys"

	driver.findElements(By.xpath("pass")).get(0).sendKeys("karam@virus");
	driver.findElement(By.xpath("login")).click();
	//driver.findElement(By.name("email")).sendKeys("gurwinders99@gmail.com");	
		//driver.findElement(By.id("day")).sendKeys("16");
	//driver.findElement(By.linkText("Forgotten account")).click();
	//driver.findElement(By.partialLinkText("Forgotten")).click();	

}}