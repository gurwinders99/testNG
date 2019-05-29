import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHandling {

	public static void main(String[] args) {
		WebDriver driver;

		String driverpath = System.getProperty("user.dir")+"\\src\\chromedriver.exe";//relative path of a project
		System.setProperty("webdriver.chrome.driver",driverpath);//built in property to launch the browser
		 driver = new ChromeDriver();
		 driver.get("file:///D:/ECLIPSE%20FILES/template_7/nested_menus.html");
		 driver.findElement(By.xpath("//h3[text()='Mouse Over Practice']")).click();
		 WebElement elm=driver.findElement(By.linkText("projects"));
		 Actions action=new Actions(driver);
		 action.moveToElement(elm);
		//action.build();
		 action.perform();
		 WebElement subelm=driver.findElement(By.linkText("Exercise2"));
		 action.moveToElement(subelm).build().perform();
		 driver.findElement(By.linkText("Alert Hnadling")).click();
		 
		 


	}

}
