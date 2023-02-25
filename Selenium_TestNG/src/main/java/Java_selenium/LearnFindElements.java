package Java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
		List<WebElement> cricket = driver.findElements(By.xpath("//*[contains(text(),'cricket')]"));
		System.out.println("Count of Cricket: " + cricket.size());
		driver.quit();
		
		LearnFindElements obj = new LearnFindElements();
		obj.main1();
		
	}
	
	public void main1() {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		
		List<WebElement> lables = driver.findElements(By.tagName("label"));
		
		for (WebElement label : lables) {
			String text = label.getText();
			System.out.println(text);
		}
		
		driver.quit();
		
	}

}