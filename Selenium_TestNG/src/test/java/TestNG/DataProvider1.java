package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	// Create a DataProvider annotations to give the login data like Excel format
	@DataProvider(name = "login")
	public String[][] data() {
		String[][] data = new String[2][2];
		// Row 1
		data[0][0] = "koushik350@gmail.com";
		data[0][1] ="Pass123$";
		
		// Row 2
		data[1][0] = "koushik1@letcode.in";
		data[1][1] ="Pass123$";
		
		return data;
	}
	
	@Test(dataProvider = "login")
	public void login(String email, String pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\guest.01\\eclipse-workspace\\java_selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
		
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		driver.quit();
	}

}
