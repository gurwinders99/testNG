import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		String driverpath = System.getProperty("user.dir")+"\\src\\chromedriver.exe";//relative path of a project
		System.setProperty("webdriver.chrome.driver",driverpath);//built in property to launch the browser
		 driver = new ChromeDriver();
		 driver.get("D:/ECLIPSE%20FILES/template_7/iFrames.html");
		 driver.switchTo().frame(1);//switch to index
		 driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		 Thread.sleep(2000);
		 Alert alt=driver.switchTo().alert();
		 alt.accept();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("iframebasic1");
		 driver.findElement(By.id("name")).sendKeys("abc");
		 driver.findElement(By.id("mail")).sendKeys("abc@gmail.com");
	
		 

	}
	 
}
