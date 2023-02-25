package TestNG;

import org.testng.annotations.Test;

public class LearnAttribute6 {
	// Groups attribute used to run the particular test cases.
	// if you use the groups attribute then create a xml file and run that.
	// groups names as : "smoke","reg","sanity"
	// in xml use the group name and run the particular group test cases
	
	@Test(groups = {"smoke"})
	public void Signup() {
		System.out.println("Sign up");
	}
	
	@Test(groups = {"reg"})
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(groups = {"sanity"})
	public void SearchProduct() {
		System.out.println("Search Product");
	}
	
	@Test(groups = {"reg"})
	public void AddtoCart() {
		System.out.println("Add to Cart");
	}
	
	@Test(groups = {"smoke"})
	public void Signout() {
		System.out.println("Sign out");
	}

}
