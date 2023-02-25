package Java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Browser Commands: 1. get(); 2. getTitle(); 3. getCurrentUrl(); 4.
		 * getPageSource(); 5. close(); 6. quit();
		 */
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://letcode.in/test");
		 driver.manage().window().maximize();
		 
		 // getTitle();
		 String title = driver.getTitle();
		 System.out.println("Current Title: " + title);
		 
		 // getCurrentUrl();
		 String CurrentURL = driver.getCurrentUrl();
		 System.out.println("CurrentURL: " + CurrentURL);
		 
		 driver.close();
		 

	}

}