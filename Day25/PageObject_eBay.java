package miniProjt;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import graphql.Assert;

public class PageObject_eBay {
	WebDriver d;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		d = new ChromeDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
	}

	// 1.login
	@Test
	public void login() {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.email_in();
		pg.password();
	}

	// 2.search
	@Test
	public void searchMultiple() {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.search();
	}

	// 3.Add to cart(delete cart also)
	@Test
	public void addToCart() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.addCart();
	}

	// 4.delete cart
	@Test(dependsOnMethods= {"login"})
	public void deleteCart() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.deletecart();
	}

	// 5.change Login Name
	@Test(dependsOnMethods = { "login" })
	public void changeLoginName() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.changename();
	}

	// 6.change Address
	@Test(dependsOnMethods = { "login" })
	public void changeAdress() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.changeadress();
	}

	// 7.select by category
	@Test
	public void selectbyCategory() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.selectcategory();
	}

	// 8.Product details
	@Test
	public void productDetails() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.proddetails();
	}

	// 9.select by all categories
	@Test
	public void selectbyAll() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.selbyall();
	}
	
	
	//10. change language
	@Test
	public void changeLanguage() throws InterruptedException {
		PageClass_ebay pg=new PageClass_ebay(d);
		pg.chnglanguage();
	}
	
	

	@AfterTest
	public void afterTest() throws InterruptedException {
		Assert.assertTrue(true, "Search button is not working");
		Thread.sleep(9000);
		d.close();
	}

}

