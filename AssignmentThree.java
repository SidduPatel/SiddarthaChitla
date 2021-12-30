package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
		
		// set system path for browser driver
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumBrowserDrivers\\chromedriver.exe");
       
        // open browser
        WebDriver driver = new ChromeDriver();  
        
       
        //open url
        
        driver.get("http://zero.webappsecurity.com/");
        
        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.name("user_login")).sendKeys("username");
        
        driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys("password");
        
        		driver.findElement(By.xpath("//input[@name='submit']")).click();

		driver.findElement(By.id("details-button")).click();

		driver.findElement(By.id("proceed-link")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Purchase Foreign Currency')]")).click();
	    Thread.sleep(1000);
	    
	

	 // ############### Alerts #################
        	     
                
        driver.findElement(By.id("purchase_cash")).click();
	    
	    Alert purchase =  driver.switchTo().alert();
	    String text =purchase.getText();
	    System.out.println("The text on the alert is : " + text);
	    purchase.accept();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Zero Bank')]")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"settingsBox\"]/ul/li[3]/a")).click();
		
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("logout_link")).click();
	    
	    Thread.sleep(1000);
	  


        
        
        //close browser
        driver.close();
       
        // kill/quit driver
        driver.quit();

	}

}
