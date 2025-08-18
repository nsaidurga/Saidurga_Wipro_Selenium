package ttestpack2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {
	

	@Test
	@Parameters({ "username", "password" })
	public void parameterr(@Optional("admin") String user,@Optional("admin@123") String pass) {
		System.out.println("Login with: " + user + " and " + pass);
		if (user.equals("admin") && pass.equals("admin@123")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login failed");
		}
	}


}
