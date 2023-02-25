package TestNG;

import org.testng.annotations.Test;

public class LearnAttribute1 {
		
	// TestNG -- Part - 4
	// Priority Attribute is used to which test case run first in TestNG
	// In Priority one method is failure then next methods is not skipped...
	
		@Test(priority = 1)
		public void Signup() {
			System.out.println("Sign up");
		}
		
		@Test(priority = 2)
		public void Login() {
			System.out.println("Login");
		}
		
		@Test(priority = 3)
		public void SearchProduct() {
			System.out.println("Search Product");
		}
		
		@Test(priority = 4)
		public void AddtoCart() {
			System.out.println("Add to Cart");
		}
		
		@Test(priority = 5)
		public void Signout() {
			System.out.println("Sign out");
		}
}
