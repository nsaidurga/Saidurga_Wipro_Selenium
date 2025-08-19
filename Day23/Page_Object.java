package testing_Pack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Page_Object {
	WebDriver d;

	@BeforeClass
	public void setUp() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.amazon.in");
		System.out.println("Opened Amazon");
	}

	// 1.login
	@Test(priority=1)
	public void testLogin() {
		
		PageClass pg = new PageClass(d);
		pg.email_in();
		// pg.continuee();
		pg.pass_in();
		pg.submit();
	}

	// 2.searchMultiple
	@Test(priority=2)
	public void searchMultiple() throws InterruptedException {
		
		PageClass pg = new PageClass(d);
		pg.searchmultiples();
	}

	// 3.addtocart
	@Test(priority=3)
	public void addTocart() {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		pg.addtocart();
	}

	// 4.deletecart
	@Test(priority=4)
	public void deleteCart() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		//pg.addtocart();
		pg.deletecart();
	}

	// 5. changeName
	@Test(priority=5)
	public void changeLoginName() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
//		pg.email_in();
//		pg.pass_in();
//		pg.submit();
		pg.changeName();
	}

	// 6.change address
	@Test(priority=6)
	public void changeAdress() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		pg.changeadress();
	}

	// 7.select By category
	@Test(priority=7)
	public void selectByCategory() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		pg.selectcategory();
	}

	// 8.select particular product right click for details
	@Test(priority=8)
	public void rightClick() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		pg.productdetails();
	}

	// 9.shop by categories(all departments)
	@Test(priority=9)
	public void shopByAllCategories() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		pg.allcategories();
	}

	// 10.change the language
	@Test(priority=10)
	public void changeLanguage() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		pg.languagechange();
	}
	
	//11.logout
	@Test(priority=11)
	public void logout() throws InterruptedException {
		d.get("https://www.amazon.com");
		PageClass pg = new PageClass(d);
		pg.signout();
	}

	@AfterClass
	public void stop() throws InterruptedException {
		Thread.sleep(3000);
		//d.close();
	}

}
