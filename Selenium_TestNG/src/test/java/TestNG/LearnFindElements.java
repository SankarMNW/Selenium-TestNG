package TestNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFindElements {
	
	@Test
	public void FindElementsOne() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
		List<WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'cricket')]"));
		System.out.println("Count of Cricket: " + cricket.size());
		driver.quit();
		
//		LearnFindElements obj = new LearnFindElements();
//		obj.FindElementsTwo();
		
	}
	
	@Test
	public void FindElementsTwo() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		List<WebElement> lables = driver.findElements(By.tagName("label"));
		
		for (WebElement label : lables) {
			String text = label.getText();
			System.out.println(text);
		}
		
		driver.quit();
		
	}

}