package TestNG1;

import org.testng.annotations.Test;

public class TestNGsample {
	
	/*open app
	 * login
	 * logout
	 */
	@Test(priority=1)
	void openapp() {
		System.out.println("opening application");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("login into the application");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("logout from application");
	}

}
