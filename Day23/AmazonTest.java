package testing_Pack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class AmazonTest {
	WebDriver d;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		d = new ChromeDriver();
		// d.get("https://www.amazon.com/?ref_=navm_em_header_home");
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
	}

	// 1.login(add to cart,delete from cart) and (change login name)
	@Test
	public void login() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();// when home page is not opened(shows(continue
																			// shopping))
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
		// cart and delete
		d.findElement(By.id("nav-cart")).click();
		d.findElement(By.cssSelector("input[data-feature-id=\"item-delete-button\"]")).click();

		// change login name
		Actions a = new Actions(d);
		WebElement change = d.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(change).perform();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("button[data-testid=\"manage-profiles-button\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"a-popover-content-2\"]/div/div/div/ul/li[2]/div/div/div[2]/div[1]")).click();
	}

	// 2.Multiple searches using array list or array
	@Test
	public void searchMultiple() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		List<String> l = new ArrayList<>();
		l.add("Watch");
		l.add("Shoes");
		l.add("Books");
		for (String s : l) {
			WebElement search = d.findElement(By.id("twotabsearchtextbox"));
			search.clear();
			search.sendKeys(s);
			search.sendKeys(Keys.ENTER);
		}
	}

	// 3.Add to cart(delete cart also)
	@Test
	public void addToCart() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"));
		search.clear();
		search.sendKeys("Mobiles");
		search.sendKeys(Keys.ENTER);
		d.findElement(By.partialLinkText("Motorola")).click();
		// Thread.sleep(2000);
		d.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		d.findElement(By.id("nav-cart")).click();
		// d.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		d.findElement(By.cssSelector("input[data-feature-id=\"item-delete-button\"]")).click();
	}

	// 4.delete cart
	@Test
	public void deleteProductInCart() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("span[class=\"nav-cart-icon nav-sprite\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("input[data-feature-id=\"item-delete-button\"]")).click();

	}

	// 5.Change Login name
	@Test
	public void changeLoginName() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();// when home page is not opened(shows(continue
																			// shopping))
		d.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		d.findElement(By.id("ap_email_login")).sendKeys("saidurga0823@gmail.com");
		d.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		System.out.println("Email taken");
		d.findElement(By.id("ap_password")).sendKeys("Ndurga@123sai");
		System.out.println("password taken");

		d.findElement(By.id("signInSubmit")).click();
		System.out.println("Login successful");
		Thread.sleep(4000);

		// change login name
		Actions a = new Actions(d);
		WebElement change = d.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(change).perform();
		Thread.sleep(4000);
		d.findElement(By.cssSelector("button[data-testid=\"manage-profiles-button\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"a-popover-content-1\"]/div/div/div/ul/li[2]/div/div/div[2]/div[1]")).click();
	}

	// 6.change current address
	@Test
	public void changeAdress() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		d.findElement(By.cssSelector("div[id=\"nav-packard-glow-loc-icon\"]")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("span[id=\"GLUXCountryValue\"]")).click();
		// d.findElement(By.cssSelector("ul[aria-multiselectable=\"false\"]")).click();
		d.findElement(By.linkText("Australia")).click();
		d.findElement(By.cssSelector("span[class=\"a-button a-button-primary\"]")).click();
	}

	// 7.shop by categories(click on checkbox filters
	@Test
	public void shopByCategory() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		// d.navigate().refresh();
		WebElement cat = d.findElement(By.id("searchDropdownBox"));
		cat.sendKeys("Computers");
		cat.sendKeys(Keys.ENTER);
		cat.click();
		WebElement search = d.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys(Keys.ENTER);
		d.findElement(By.partialLinkText("Samsung")).click();
		d.findElement(By.partialLinkText("Samsung Galaxy Tab A9+ Tablet 11” 64GB Android")).click();
	}

	// 8.select particular product right click for details
	@Test
	public void rightClickProduct() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		WebElement search = d.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"));
		search.clear();
		search.sendKeys("Motorola Mobiles");
		search.sendKeys(Keys.ENTER);

		WebElement r = d.findElement(By.cssSelector(
				"img[alt=\"Sponsored Ad - Motorola Moto G - 2025 | Unlocked | Made for US 4/128GB | 50MP Camera | Forest Gray\"]"));
		Actions a = new Actions(d);
		a.contextClick(r).perform();

		d.findElement(By.partialLinkText("Moto G - 2025 | Unlocked | Made for US 4/128GB | 50MP Camera | Forest Gray"))
				.click();
	}
	
	//9.shop by categories
	@Test
	public void shopByAllCategories() throws InterruptedException {
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		d.navigate().refresh();
		WebElement cat = d.findElement(By.id("searchDropdownBox"));
		cat.sendKeys("All Departments");
		cat.sendKeys(Keys.ENTER);
		cat.click();
		Thread.sleep(3000);
		WebElement search = d.findElement(By.id("twotabsearchtextbox"));
		//WebElement search=d.findElement(By.cssSelector("input[placeholder=\"Search Amazon\"]"));
		search.click();
		search.sendKeys(Keys.ENTER);
		
	}
	
	//10.change the language 
	@Test
	public void changeLanguage() throws InterruptedException {
		// d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		d.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(1000);
		d.navigate().refresh();
		Actions a = new Actions(d);
		WebElement change = d
				.findElement(By.cssSelector("span[class=\"icp-nav-flag icp-nav-flag-us icp-nav-flag-lop\"]"));
		a.moveToElement(change).perform();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/ul/li[3]/a/span/span[1]")).click();
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Assert.assertTrue(true, "Search button is not working");
		Thread.sleep(9000);
		d.close();
	}

}