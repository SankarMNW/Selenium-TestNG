package TestNG;

import org.testng.annotations.Test;

public class LearnAttribute2 {
	// TestNG -- Part - 5
	// dependsOnMethods is used to depend the method in another method. if not run the base method cannot run the depended method
	// if you use the priority and dependsOnMethods -- First Preference is "dependsOnMethods" Attribute.
	// in dependOnMethods One method is failure then next methods are skipped
	
	// if Test method in Different package and Different Class define like ==> "" dependsOnMethods = packageName.className.methodName ""
	// Example ==> @Test(dependsOnMethods = "TestNG.LearnAttribute1.Signup")
	
	
	@Test(priority = 1)
	public void Signup() {
		System.out.println("Sign up");
	}
	
	@Test(dependsOnMethods = "Signup",priority = -1)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods = "Login" )
	public void SearchProduct() {
		System.out.println("Search Product");
		// if i create a exception fail the method and next depended methods are skipped. 
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "SearchProduct")
	public void AddtoCart() {
		System.out.println("Add to Cart");
	}
	
	@Test(dependsOnMethods = "AddtoCart")
	public void Signout() {
		System.out.println("Sign out");
	}

}
