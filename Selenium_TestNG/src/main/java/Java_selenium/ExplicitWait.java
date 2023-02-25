package Java_selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// WebDriverWait ==> It is a class name. used to achieve the Explicit wait.
		// if you create explicit wait. which you want wait use wait object
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://letcode.in/waits");		
//		driver.findElement(By.id("accept")).click();
		
		// Scenario 1 ==> click the alertBox (alertIsPresent)
//		Alert until = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println("Alert Msg: "+until.getText());
//		until.accept();
//		driver.switchTo().alert().accept();

		// Scenario 2 ==> VisibilityOf & InVisibilityOf
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		// Then i click the signout button can't work because toast message is visible so i wait for toast close time.		
		WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(toast.getText());
		wait.until(ExpectedConditions.invisibilityOf(toast));
		driver.findElement(By.linkText("Sign out")).click();
		
		
		
	}

}
