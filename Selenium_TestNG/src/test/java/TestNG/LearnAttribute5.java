package TestNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAttribute5 {
//	TestNG -- Part-8
	
//	1. threadPoolSize
	// if use threadPoolSize must use invocationCount attribute.
	// threadPoolSize is used to run the browsers in parallel mode.
	// Example: invocationCount = 3, threadPoolSize = 3 ==> Run the 3 Browsers in same Time. 

	@Test(invocationCount = 3, threadPoolSize = 2)
	public void FindElements() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
		List<WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'cricket')]"));
		System.out.println("Count of Cricket: " + cricket.size());
		driver.quit();
	}
	
	
//	2. timeOut
	// TimeOut Attribute is used to run the browser within the time.[10000 = 10 Seconds]
	// if Browser not execute within 10 seconds raise ThreadTimeoutException.
	
//	@Test(timeOut = 10000)
//	public void FindElements() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
//		List<WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'cricket')]"));
//		System.out.println("Count of Cricket: " + cricket.size());
//		driver.quit();
//	}
	
	
//	2. expectedException
	// This is used to if exception is raised use expectedException. is just pass the test case without error.
	// Example ==> I change the findElement(By.name("q1"), raise the exception in "NoSuchElementException".
	
//	@Test(expectedExceptions = {NoSuchElementException.class})
//	public void FindElements() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q1")).sendKeys("cricket",Keys.ENTER);
//		List<WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'cricket')]"));
//		System.out.println("Count of Cricket: " + cricket.size());
//		driver.quit();
//	}
		

}
