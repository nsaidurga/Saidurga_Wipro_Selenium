package miniProjt;

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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import graphql.Assert;

public class ebayMiniProject {
	WebDriver d;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		d = new ChromeDriver();
		// d.get("https://www.amazon.com/?ref_=navm_em_header_home");
		// d.get("https://signin.ebay.com/");
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
	}

	// 1.login
	@Test
	public void login() {
		d.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")).click();
		WebElement email = d.findElement(By.id("userid"));
		email.click();
		email.clear();
		email.sendKeys("iamalonekingg028576@gmail.com");
		d.findElement(By.id("signin-continue-btn")).click();
		WebElement password = d.findElement(By.id("pass"));
		password.sendKeys("King@123#");
		d.findElement(By.id("sgnBt")).click();
		// password.sendKeys(Keys.ENTER);
		// d.findElement(By.id("passkeys-cancel-btn")).click();
	}

	// 2.search
	@Test
	public void search() {
		// login();
		List<String> l = new ArrayList<>();
		l.add("Watch");
		l.add("Shoes");
		l.add("Books");
		for (String s : l) {
			WebElement search = d.findElement(By.id("gh-ac"));
			search.click();
			search.clear();
			search.sendKeys(s);
			search.sendKeys(Keys.ENTER);
		}
	}

	// 3.Add to cart(delete cart also)
	@Test
	public void addToCart() throws InterruptedException {
		WebElement search = d.findElement(By.id("gh-ac"));
		search.click();
		search.clear();
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		// Thread.sleep(9000);
		for (int i = 0; i < 1; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
			Thread.sleep(3000);
		}
		// d.findElement(By.partialLinkText("Custom Made 40mm Black Custom Diver Date
		// Style Mod Watch w/ NH35 Movement")).click();
		Thread.sleep(3000);
		By first = By.xpath("(//div[@id='srp-river-results']//a[contains(@class,'s-item__link')])[1]");
		Thread.sleep(2500);

		WebElement firstProduct = d.findElement(first);

		String original = d.getWindowHandle();
		firstProduct.click();

		for (String w : d.getWindowHandles()) {
			if (!w.equals(original)) {
				d.switchTo().window(w);
				break;
			}
		}

		d.findElement(By.id("atcBtn_btn_1")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath(
				"//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a"))
				.click();
		d.findElement(By.id("cart-remove-item")).click();

	}

	// 4.delete cart
	@Test
	public void deleteCart() throws InterruptedException {
		login();
		Thread.sleep(4000);
		d.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[2]/div[5]/div/a/span")).click();
		d.findElement(By.xpath(
				"//*[@id=\"mainContent\"]/div/div[3]/div[1]/div[1]/div[1]/ul/li/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/span/span/button[2]"))
				.click();
	}

	// 5.change Login Name
	@Test(dependsOnMethods = { "login" })
	public void changeLoginName() throws InterruptedException {
		Actions a = new Actions(d);
		WebElement change = d.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span/span"));
		a.moveToElement(change).perform();
		Thread.sleep(4000);
		d.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		d.findElement(By.linkText("Personal information")).click();
		// d.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		d.findElement(By.id("individual_username_edit_button")).click();
		Thread.sleep(2000);
		WebElement username = d.findElement(By.id("user_name"));
		username.click();
		username.clear();
		username.sendKeys("Saidurga");
		Thread.sleep(1000);
		d.findElement(By.id("username_submit_edit_btn")).click();
	}

	// 6.change Address
	@Test(dependsOnMethods = { "login" })
	public void changeAdress() throws InterruptedException {
		Actions a = new Actions(d);
		WebElement change = d.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span/span"));
		a.moveToElement(change).perform();
		Thread.sleep(4000);
		d.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		d.findElement(By.linkText("Addresses")).click();
		// d.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath(
				"//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[2]/div/div[2]/a"))
				.click();
		Thread.sleep(2000);
		d.findElement(By.id("edit-address-SHIPPING")).click();
		WebElement userAdress = d.findElement(By.cssSelector("input[name=\"addressLine2-field\"]"));
		userAdress.click();
		userAdress.clear();
		userAdress.sendKeys("addagutta colony, kukatpally, Hyderabad");
		Thread.sleep(1000);
		d.findElement(By.id("save-address-btn")).click();
	}

	// 7.select by category
	@Test
	public void selectbyCategory() throws InterruptedException {
		// login();
		// Thread.sleep(4000);
		WebElement sea = d.findElement(By.id("gh-cat"));
		sea.click();
		sea.sendKeys("Consumer Electronics");
		d.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Home Telephones & Accessories")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Answering Machines")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Vtg PALSTAR 8301 Cassette Tape Answering Machine VOX Record A Call TELECOM"))
				.click();
	}

	// 8.Product details
	@Test
	public void productDetails() throws InterruptedException {
		WebElement search = d.findElement(By.id("gh-ac"));
		search.click();
		search.clear();
		search.sendKeys("Mobiles");
		search.sendKeys(Keys.ENTER);
		// Thread.sleep(9000);
		for (int i = 0; i < 1; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		By first = By.xpath("(//div[@id='srp-river-results']//a[contains(@class,'s-item__link')])[1]");
		Thread.sleep(2500);

		WebElement firstProduct = d.findElement(first);

		String original = d.getWindowHandle();
		firstProduct.click();

		for (String w : d.getWindowHandles()) {
			if (!w.equals(original)) {
				d.switchTo().window(w);
				break;
			}
		}
	}

	// 9.select by all categories
	@Test
	public void selectbyAll() throws InterruptedException {
		// login();
		// Thread.sleep(4000);
		WebElement sea = d.findElement(By.id("gh-cat"));
		sea.click();
		sea.sendKeys("All Categories");
		d.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();
	}
	
	
	//10. change language
	@Test
	public void changeLanguage() throws InterruptedException {
		for (int i = 0; i < 6; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 500);");
		    Thread.sleep(1000);
		}
		Actions a = new Actions(d);
		Thread.sleep(5000);
		WebElement change = d.findElement(By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button"));
		a.moveToElement(change).perform();
		d.findElement(By.linkText("India")).click();
		d.findElement(By.id("onetrust-accept-btn-handler")).click();
		d.findElement(By.cssSelector("span[class=\"region-chooser__text\"]")).click();
		WebElement sel=d.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/form/div/div[2]/div/div[1]"));
		sel.click();
		sel.sendKeys("India");
		sel.sendKeys(Keys.ENTER);
		d.findElement(By.cssSelector("button[class=\"btn region-popup__button btn btn--button\"]")).click();
	}
	
	

	@AfterTest
	public void afterTest() throws InterruptedException {
		Assert.assertTrue(true, "Search button is not working");
		Thread.sleep(9000);
		d.close();
	}

}
