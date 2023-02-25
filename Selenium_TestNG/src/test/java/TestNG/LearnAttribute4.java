package TestNG;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttribute4 {
//	TestNG -- part-7
	
	// enable ==> if use enable is false the test case not consider in runtime
	
	// alwaysRun ==> alwaysRun as true if the depend test case is fail but this is always run
		
	// description ==> description is used to pass the message about the test case
	
	@Test(enabled = false)
	public void Signup() {
		System.out.println("Sign up");
	}
	
	@Test(priority = 1,description = "This case used to login the page..")
	public void Login() {
		System.out.println("Login");
		// if i create a exception fail the method and next depended methods are skipped. but use "alwaysRun = true" run the next test case.
		throw new NoSuchElementException();
	}
	
	@Test(alwaysRun = true)
	public void SearchProduct() {
		System.out.println("Search Product");
	}
	
}
