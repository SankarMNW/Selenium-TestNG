package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters1 {
	
	// Pass the emailid & password through xml file. "Param.xml"
	// Add annotation @Parameters(org.testng.annotations.Test)
	
	@Parameters({"emailId","password"})
	@Test
	
	// if you pass the parameters in xml create the arguments inside method
	public void login(String email, String pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
		
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	}
	

}
