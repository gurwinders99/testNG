import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
	WebDriver driver;
	@Test
	public void alaunchBrowser() {
		String driverPath= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		 driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
	}
	@DataProvider
public String[][] readData() {
	String sheetpath=System.getProperty("user.dir")+"\\src\\TestData\\testdata.xlsx";//readData from the excel sheet
	Xls_Reader xls=new Xls_Reader(sheetpath);
	int rCount=xls.getRowCount("sheet1");	
	int cCount=xls.getColumnCount("sheet1");
	String[][] testDataArr= new String[rCount][cCount];//temporary storage of value 
	for(int i=0;i<rCount;i++) {
		for(int j=0;j<cCount;j++) {
			testDataArr[i][j]=xls.getCellData("sheet1", j, i);
			System.out.println(testDataArr[i][j]);
		}
	}
		return testDataArr;
}
	@Test(dataProvider="readData")
public void checkLoginForm(String uname, String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
}

