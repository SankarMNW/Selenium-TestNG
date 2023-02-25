package Java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		
		// Three ways to select the dropdown
//		1. selectByIndex
//		2. selectByValue
//		3. selectByVisibleText
		
		Select dropDown = new Select(driver.findElement(By.id("fruits")));
//		dropDown.selectByIndex(3);
//		dropDown.selectByValue("1");
		dropDown.selectByVisibleText("Pine Apple");
		
		
		// Select multiple selector 
		Select mSel = new Select(driver.findElement(By.id("superheros")));
		
		// check the dropdown is multiple select or not
//		System.out.println(mSel.isMultiple());
		
		if(mSel.isMultiple()) {
			mSel.selectByIndex(0);
			mSel.selectByIndex(2);
			mSel.selectByIndex(4);
			mSel.selectByIndex(6);						
		}
		
		// get the drop down options
//		1. getOptions()
//		2. getFirstSelectedOption()
//		3. getSelectedOptions()
		
//		1. getOptions()
		List<WebElement> FirstDrop =  dropDown.getOptions();
		for (WebElement element : FirstDrop) {
			String values = element.getText();
			System.out.println(values);
		}
		
//		2. getFirstSelectedOption()
		System.out.println("-------------------------------------------------");
		WebElement firsOpt = mSel.getFirstSelectedOption();
		System.out.println(firsOpt.getText());
		
//		3. getSelectedOptions()
		System.out.println("-------------------------------------------------");
		List<WebElement> AllSel =  mSel.getAllSelectedOptions();
		for (WebElement ele : AllSel) {
			String AllOptions = ele.getText();
			System.out.println(AllOptions);
		}
		
		
		
		

	}

}