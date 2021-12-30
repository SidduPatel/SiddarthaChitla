package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\SeleniumBrowserDrivers\\chromedriver.exe");

		// open browser
		WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("http://zero.webappsecurity.com/");

		// ======= By ID
		driver.findElement(By.id("feedback")).click();
		Thread.sleep(2000);

		// xpath = tag+attribute = //tag[@attritube='value']
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("Siddartha");
		Thread.sleep(1000);

		// === By id+attribute -- css = #id[attribute=value]
		driver.findElement(By.cssSelector("#email[type='text']")).sendKeys("siddartha@gmail.com");
		Thread.sleep(1000);

		// ======= By name
		driver.findElement(By.name("subject")).sendKeys("FeedbackInfo");
		Thread.sleep(1000);

		// === By tag+id+attribute -- css = tag#id[attribute=value]
		driver.findElement(By.cssSelector("textarea#comment[name='comment']")).sendKeys("No issues");
		Thread.sleep(1000);

		// ======= By name
		driver.findElement(By.name("clear")).click();
		Thread.sleep(1000);

		// ===== By id css = #idvalue
		driver.findElement(By.cssSelector("#name")).sendKeys("Siddartha");
		Thread.sleep(1000);

		// === By id+attribute -- css = #id[attribute=value]
		driver.findElement(By.cssSelector("#email[type='text']")).sendKeys("siddartha@gmail.com");
		Thread.sleep(1000);

		// ======= By name
		driver.findElement(By.name("subject")).sendKeys("FeedbackInfo");
		Thread.sleep(1000);

		// ======= By name
		driver.findElement(By.name("comment")).sendKeys("no issues");

		// ======= By name
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);

		// xpath = tag+attribute = //tag[@attritube='value']
		driver.findElement(By.xpath("//button[@type='button']")).click();

		// ===== By attribute css = [attribute=value]
		driver.findElement(By.cssSelector("[type='text']")).click();

		// xpath = tag+attribute = //tag[@attritube='value']
		driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("username");

		// === By tag+attribute -- css = tag[attribute=value]
		driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys("password");

		// xpath = tag+attribute = //tag[@attritube='value']
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		driver.findElement(By.id("details-button")).click();

		driver.findElement(By.id("proceed-link")).click();

		driver.findElement(By.xpath("//a[contains(@href,'/index.html')]")).click();
		Thread.sleep(1000);

		// === By absolute path
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(1000);

		// === By css = #id
		driver.findElement(By.cssSelector("#logout_link")).click();
		Thread.sleep(1000);

		// Close browser
		driver.close();

		// kill/quit driver
		driver.quit();

	}

}