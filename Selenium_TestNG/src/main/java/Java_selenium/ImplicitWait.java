package Java_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		
		// implicitlyWait is used to wait every element in within 
		// implicitlyWait is affected "FindElement & FindElements" methods only.
		// implicitlyWait is One Time Declaration. once created to wait the Every Elements.
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");

	}

}
