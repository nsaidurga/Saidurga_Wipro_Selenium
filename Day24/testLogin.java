package ttestpack2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testing_Pack.PageClass;

public class testLogin {
	WebDriver d;

	@BeforeClass
	public void beforeClass() {
		d = new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
	}

	// Login
	@Test
	public void login() throws InterruptedException {
		d.get("https://www.amazon.com");
		LoginPageClass pg = new LoginPageClass(d);
		pg.email_in();
		// pg.continuee();
		pg.pass_in();
		pg.submit();
	}

	// searches
	@Test(dependsOnMethods = { "login" })
	public void searchMultiple() throws InterruptedException {
		d.get("https://www.amazon.com");
		LoginPageClass pg = new LoginPageClass(d);
		pg.searchmultiples();
	}

	// log out
	@Test(dependsOnMethods = { "login" })
	public void logOut() throws InterruptedException {
		// login();
		d.get("https://www.amazon.com");
		LoginPageClass pg = new LoginPageClass(d);
		pg.logout();
		
		System.out.println("log out successful");
		
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(3000);
		d.close();
	}

}
