package automationdemo.TestCase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import automationdemo.PageObject.RegisterPage;

public class RegisterPageTest extends BaseClass{
	RegisterPage rp;
     @Test
	public void registerpage() throws InterruptedException {
    	 rp =  new RegisterPage(driver);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 rp.firstname(firstname);
		 rp.lastname(lastname);
		 rp.maleradiobutton();
		 rp.femaleradiobutton();
		 Thread.sleep(2000);
		 rp.checkbox();
		 Thread.sleep(5000);
		 rp.dropdown(2);
		 Thread.sleep(5000);	
	}
     
     
     
     
}
