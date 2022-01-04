package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssignmentOnFourth {

	public WebDriver driver;

	@BeforeTest
	public void setUp() {
		  System.setProperty("webdriver.chrome.driver","c:\\SeleniumBrowserDrivers\\chromedriver.exe");
		 
			// open browser
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void LoginTest() {
	  	driver.get("http://zero.webappsecurity.com/");
			driver.findElement(By.id("signin_button")).click();
			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.name("submit")).click();
		    driver.findElement(By.id("details-button")).click();	  
			driver.findElement(By.id("proceed-link")).click();  	  
			
	}
	@Test(priority = 2)
	public void Pay_Bills() throws InterruptedException {
		    driver.findElement(By.linkText("Pay Bills")).click();
			driver.findElement(By.linkText("Purchase Foreign Currency")).click();
			driver.findElement(By.id("purchase_cash")).click();
			Alert jsAlert = driver.switchTo().alert();
			String alertText = jsAlert.getText();		
			System.out.println("Please ensure that you have filled all the required fields with valid values. -'"+ alertText + "'");
			jsAlert.accept();	
			Thread.sleep(2000);
	}

	@Test(priority = 3) 
	public void Transfer_Funds() {
		driver.findElement(By.linkText("Transfer Funds")).click();
		driver.findElement(By.id("tf_amount")).sendKeys("100");
		driver.findElement(By.id("btn_submit")).click();	
		driver.findElement(By.id("btn_submit")).click();
		
	}

	

	@AfterTest
	public void cleanUp() {
		//Close browser
		     driver.close();
		        
		//kill/quit driver
		       driver.quit();
	}

}
