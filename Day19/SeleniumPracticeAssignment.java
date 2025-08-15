package testing_Pack;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import graphql.Assert;
import org.testng.Assert;

/* Selenium Practice Assignment – "E-Commerce Website Automation"
Objective :Automate a few test scenarios on a sample e-commerce site using Selenium WebDriver.
 */

public class SeleniumPracticeAssignment {
	WebDriver d;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		d = new ChromeDriver();
		// d.get("https://www.amazon.com/");
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
	}

	// Task 1 – Login Test
	@Test
	public void login() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		d.findElement(By.id("ap_email_login")).sendKeys("saidurga0823@gmail.com");
		d.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		System.out.println("Email taken");
		d.findElement(By.id("ap_password")).sendKeys("Ndurga@123sai");
		System.out.println("password taken");

		d.findElement(By.id("signInSubmit")).click();
		System.out.println("Login successful");
		Thread.sleep(3000);

		// account details
		Actions a = new Actions(d);
		WebElement change = d.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(change).perform();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/ul/li[3]/a")).click();
	}

	// driver.findElements(By.cssSelector(".product-item")).get(0).click();

	// 3.Add to cart
	@Test
	public void addToCart() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"));
		search.clear();
		search.sendKeys("Mobiles");
		search.sendKeys(Keys.ENTER);
		d.findElement(By.partialLinkText("Motorola")).click();
		Thread.sleep(2000);
		WebElement add = d.findElement(By.id("add-to-cart-button"));
		add.click();
		System.out.println("product is added to cart");
		Thread.sleep(9000);
		WebElement popup = d.findElement(By.cssSelector("h1.sw-atc-text"));
		Assert.assertTrue(popup.isDisplayed());
		System.out.println("pop up message is displayed");
	}
	
	//3.Order product
	@Test
	public void purchaseProduct() throws InterruptedException {

		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		d.findElement(By.id("ap_email_login")).sendKeys("saidurga0823@gmail.com");
		d.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		System.out.println("Email taken");
		d.findElement(By.id("ap_password")).sendKeys("Ndurga@123sai");
		System.out.println("password taken");

		d.findElement(By.id("signInSubmit")).click();
		System.out.println("Login successful");
		Thread.sleep(3000);
		//go to cart
		d.findElement(By.id("nav-cart")).click();
		d.findElement(By.cssSelector("input[data-feature-id=\"proceed-to-checkout-action\"]")).click();
		d.findElement(By.xpath("//*[@id=\"pp-0JgJUh-144\"]/div/div/div/div/div[2]/div[1]/div")).click();
		d.findElement(By.cssSelector("input[data-csa-c-slot-id=\"checkout-secondary-continue-shipaddressselect\"]")).click();
		d.findElement(By.id("placeYourOrder")).click();
		System.out.println("Order placed successfully");
	}
	// 4/log out
	@Test
	public void logOut() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		d.findElement(By.id("ap_email_login")).sendKeys("saidurga0823@gmail.com");
		d.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		System.out.println("Email taken");
		d.findElement(By.id("ap_password")).sendKeys("Ndurga@123sai");
		System.out.println("password taken");

		d.findElement(By.id("signInSubmit")).click();
		System.out.println("Login successful");
		Thread.sleep(3000);

		// account details
		Actions a = new Actions(d);
		WebElement change = d.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(change).perform();
		Thread.sleep(3000);
		d.findElement(By.id("nav-item-signout")).click();
		System.out.println("log out successful");
		//for validate sign in page opende or not
		Thread.sleep(9000);
		WebElement signinpage=d.findElement(By.cssSelector("h1[class=\"a-size-medium-plus a-spacing-small\"]"));
		Assert.assertTrue(signinpage.isDisplayed());
		System.out.println("sign in page is again opened");
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Assert.assertTrue(true, "Search button is not working");
		 Thread.sleep(9000);
		 d.close();
	}

}
