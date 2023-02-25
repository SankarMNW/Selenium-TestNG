package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.DataUtils;

// if you have 2 ways to run the different package and different class  data provider execution
// 1. inheritance ==> using extends
// 2. dataProviderClass = ClassName.class
//public class DataProvider2 extends DataUtils{
public class DataProvider2 {
	
	@Test(dataProvider = "login", dataProviderClass = DataUtils.class )
//	public void login(String email, String pass) 
	
	// if you have multiple values pass the arguments using this "(String data[])"
	public void login(String data[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(data[0]); // 0th Column(username)
		driver.findElement(By.name("password")).sendKeys(data[1]);	// 1st Column(password)
		
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
		
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
//		driver.quit();
	}

}
