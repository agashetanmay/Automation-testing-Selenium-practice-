package automationdemo.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import automationdemo.Utilities.Readconfig;

public class BaseClass {
	
	Readconfig readconfig = new Readconfig();
	
	 public String baseURL= readconfig.baseurl();
	 public String firstname = readconfig.firstname();
	 public String lastname = readconfig.lastname();
	 public String switchto = "Alerts";
	 
	 public static WebDriver driver;
	 
	
	@BeforeClass
	 public void setup() {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(baseURL);
	 }
	 
	 @AfterClass
	 public void teardown() {
		 
		 driver.close();
		 
	 }

}
