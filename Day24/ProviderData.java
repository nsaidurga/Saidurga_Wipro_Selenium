package ttestpack2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderData {
	
	@DataProvider(name="loginData")
	public Object[][] getData(){
		return new Object[][] {
			{"admin","admin123"},
			{"user1","user123"},
			{"guest","guest123"}
		};
	}
	
	
	@Test(dataProvider = "loginData")
	public void login(String username, String password) {
		System.out.println("Trying login with Username: " + username + " | Password: " + password);

		if (username.equals("admin") && password.equals("admin123")) {
			System.out.println("Login successful for: " + username);
		} else {
			System.out.println("Login failed for: " + username);
		}
	}
}
