package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters2 {
	
	// Create a xml file => Param2.xml
	
	@Parameters({"emailId","password","browser"})
	@Test
	
	// if you pass the parameters in xml create the arguments inside method
	public void login(String email, String pass, String browser) {
		RemoteWebDriver driver = null;
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
		default:
			System.err.println("Browser is not defined!.");
			break;
		}
//	
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
