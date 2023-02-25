package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAttribute3 {
	
	// TestNG -- Part - 6
		
	// InvocationCount ==> used to how many times run the @Test case in loop mode. If give 3 the @Test case run 3 Times.
	
	// invocationTimeOut ==> is used to @Test Case Run within the Time. if give 20000 the @Test Case run within 20 seconds,
	//else @Test Case are Failed.  Exception: "ThreadTimeoutException"
	
	// only invocationTimeOut attribute is invocationCount with the test case 
	
	
	@Test(invocationCount = 3,invocationTimeOut = 30000)
//	@Test(invocationCount = 3)
	public void FindElements() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
		List<WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'cricket')]"));
		System.out.println("Count of Cricket: " + cricket.size());
		driver.quit();

	}

}
