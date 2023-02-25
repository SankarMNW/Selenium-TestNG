package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.ExcelDataUtils;

public class ExcelToDataProvider {
		
		@Test(dataProvider = "login", dataProviderClass = ExcelDataUtils.class)
		public void login(String data[]){
			System.err.println("Email: " + data[0]);
			System.err.println("Pass: " + data[1]);
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://letcode.in/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.name("email")).sendKeys(data[0]); // 0th Column(username)
			driver.findElement(By.name("password")).sendKeys(data[1]);	// 1st Column(password)
			
			driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
			
			String title = driver.getTitle();
			System.out.println("Page Title: " + title);
			driver.quit();
		}



}
