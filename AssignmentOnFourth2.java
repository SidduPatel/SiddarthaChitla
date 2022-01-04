package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssignmentOnFourth2 {

		public WebDriver driver;
		
		@BeforeTest
		  public void setUp() {
			  System.setProperty("webdriver.chrome.driver","c:\\SeleniumBrowserDrivers\\chromedriver.exe");
			 
				// open browser
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		  }


		@Test(groups= {"regression"})
		public void a_negativeTest() 
			  {
			    	driver.get("http://zero.webappsecurity.com/");
					driver.findElement(By.id("signin_button")).click();
					driver.findElement(By.id("user_login")).sendKeys("usernam");
					driver.findElement(By.id("user_password")).sendKeys("passord");
					driver.findElement(By.name("submit")).click();
					System.out.println("Test1");	  
			  }

		@Test(groups= {"smoke"})
		public void b_login()
			  {
			    	driver.get("http://zero.webappsecurity.com/");
					driver.findElement(By.id("signin_button")).click();
					driver.findElement(By.id("user_login")).sendKeys("username");
					driver.findElement(By.id("user_password")).sendKeys("password");
					driver.findElement(By.name("submit")).click();
				    driver.findElement(By.id("details-button")).click();	  
					driver.findElement(By.id("proceed-link")).click();  	  
			  }

		@Test(groups= {"smoke"})
		public void c_Transfer_Funds() {
			driver.findElement(By.linkText("Transfer Funds")).click();
			driver.findElement(By.id("tf_amount")).sendKeys("100");
			driver.findElement(By.id("btn_submit")).click();	
			driver.findElement(By.id("btn_cancel")).click();	
		}


		@Test(groups= {"regression"})
		public void d_Pay_Saved_Payee()
		{
			    driver.findElement(By.linkText("Pay Bills")).click();
			   driver.findElement(By.linkText("Pay Saved Payee")).click();
			    driver.findElement(By.id("pay_saved_payees")).click();			
			    System.out.println("Test2");	  
		}

		@Test  (groups= {"regression"}) 
		public void e_Pay_Saved_Payee() 
		{
			    driver.findElement(By.linkText("Pay Bills")).click();
			    driver.findElement(By.linkText("Pay Saved Payee")).click();
			    driver.findElement(By.id("pay_saved_payees")).click();			
			    driver.findElement(By.id("sp_amount")).sendKeys("100");
			    driver.findElement(By.id("pay_saved_payees")).click();		    
			    System.out.println("Test");	  
		}

		@AfterTest
		public void cleanUp() {
			//Close browser
			     driver.close();
			        
			//kill/quit driver
			       driver.quit();
	}

}
