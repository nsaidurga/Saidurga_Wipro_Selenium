package testing_Pack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
	WebDriver d;
	WebDriverWait wait;

	By navSignIn = By.id("nav-link-accountList-nav-line-1");
	By email = By.id("ap_email_login");
	By pass = By.id("ap_password");
	By cont = By.id("continue");
	By search = By.id("gh-ac");
	By submit = By.id("signInSubmit");

	By hoversignin = By.id("nav-link-accountList-nav-line-1");
	By manage = By.cssSelector("button[data-testid=\"manage-profiles-button\"]");
	By newProfile = By.xpath("//*[@id=\"a-popover-content-2\"]/div/div/div/ul/li[2]/div/div/div[2]/div[1]");

	By begin = By.cssSelector("button[type=\"submit\"]");
	By searchButton = By.cssSelector("input[placeholder=\"Search Amazon\"]");
	By elementSearch = By.partialLinkText("Motorola");
	By additemTocart = By.id("add-to-cart-button");
	By addCartButton = By.id("nav-cart");

	By searchItem = By.id("twotabsearchtextbox");
	By deleteItem = By.cssSelector("input[data-feature-id=\"item-delete-button\"]");

	public PageClass(WebDriver d) {
		this.d = d;
		this.wait = new WebDriverWait(d, Duration.ofSeconds(10));
	}

	public void email_in() {
		d.findElement(begin).click();
		d.findElement(navSignIn).click();
		d.findElement(email).sendKeys("saidurga0823@gmail.com");
		d.findElement(cont).click();
	}

	public void pass_in() {
		d.findElement(pass).sendKeys("Ndurga@123sai");
	}

	public void continuee() {
		d.findElement(cont).click();
	}

	public void submit() {
		d.findElement(submit).click();
	}

	public void searchmultiples() {
		//d.findElement(begin).click();
		List<String> l = new ArrayList<>();
		l.add("Watch");
		l.add("Shoes");
		l.add("Books");
		for (String s : l) {
			WebElement search = d.findElement(searchItem);
			search.clear();
			search.sendKeys(s);
			search.sendKeys(Keys.ENTER);
		}
	}

	public void addtocart() {
		//d.findElement(begin).click();
		d.findElement(searchButton).clear();
		d.findElement(searchButton).sendKeys("Mobiles");
		d.findElement(searchButton).sendKeys(Keys.ENTER);
		d.findElement(elementSearch).click();
		d.findElement(additemTocart).click();
	}

	public void deletecart() throws InterruptedException {
		// d.findElement(begin).click();
		Thread.sleep(2000);
		d.findElement(addCartButton).click();
		Thread.sleep(3000);
		d.findElement(deleteItem).click();
	}

	public void changeName() throws InterruptedException {
		Thread.sleep(2000);
		d.findElement(addCartButton).click();
		Thread.sleep(3000);
		d.findElement(deleteItem).click();

		Actions a = new Actions(d);
		WebElement change = d.findElement(hoversignin);
		a.moveToElement(change).perform();
		Thread.sleep(3000);
		d.findElement(manage).click();
		Thread.sleep(3000);
		d.findElement(newProfile).click();
	}

	By a = By.cssSelector("div[id=\"nav-packard-glow-loc-icon\"]");
	By b = By.cssSelector("span[id=\"GLUXCountryValue\"]");
	By countrySelect = By.linkText("Australia");
	By c = By.cssSelector("span[class=\"a-button a-button-primary\"]");
	By address=By.cssSelector("input[name=\"IINPHFRT6VYRIH5Y5PB4G12O8RMVM9JKVA3KVKJ9MVMR8OMPXTQ2EQA2OXNCDW2B:0:mkkimqkptplq\"]");
	public void changeadress() throws InterruptedException {
		//d.findElement(begin).click();
		d.findElement(a).click();
		Thread.sleep(3000);
		d.findElement(b).click();
		d.findElement(address).click();
		//d.findElement(countrySelect).click();
		d.findElement(c).click();
	}

	By s = By.id("searchDropdownBox");
	By itemSam = By.partialLinkText("Samsung");
	By item = By.partialLinkText("Samsung Galaxy Tab A9+ Tablet 11” 64GB Android");

	public void selectcategory() throws InterruptedException {
		//d.findElement(begin).click();
		WebElement cat = d.findElement(s);
		cat.sendKeys("Computers");
		cat.sendKeys(Keys.ENTER);
		cat.click();
		WebElement search = d.findElement(searchItem);
		search.click();
		search.sendKeys(Keys.ENTER);
		d.findElement(itemSam).click();
		d.findElement(item).click();
	}

	By moto = By.cssSelector(
			"img[alt=\"Sponsored Ad - Motorola Moto G - 2025 | Unlocked | Made for US 4/128GB | 50MP Camera | Forest Gray\"]");
	By motoProduct = By.partialLinkText("Moto G - 2025 | Unlocked | Made for US 4/128GB | 50MP Camera | Forest Gray");

	public void productdetails() throws InterruptedException {
		//d.findElement(begin).click();
		WebElement search = d.findElement(searchButton);
		search.clear();
		search.sendKeys("Motorola Mobiles");
		search.sendKeys(Keys.ENTER);
		WebElement r = d.findElement(moto);
		Actions a = new Actions(d);
		a.contextClick(r).perform();
		d.findElement(motoProduct).click();
	}

	By arrow = By.id("searchDropdownBox");

	public void allcategories() throws InterruptedException {
		//d.findElement(begin).click();
		d.navigate().refresh();
		WebElement cat = d.findElement(arrow);
		cat.sendKeys("All Departments");
		cat.sendKeys(Keys.ENTER);
		cat.click();
		Thread.sleep(3000);
		WebElement search = d.findElement(searchItem);
		// WebElement search=d.findElement(searchButton);
		search.click();
		search.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(400,700)");
	}
	
	By icon=By.cssSelector("span[class=\"icp-nav-flag icp-nav-flag-us icp-nav-flag-lop\"]");
	By lan=By.xpath("//*[@id=\"nav-flyout-icp\"]/div[2]/ul/li[3]/a/span/span[1]");
	public void languagechange() throws InterruptedException {
		//d.findElement(begin).click();
		Thread.sleep(1000);
		//d.navigate().refresh();
		Actions a = new Actions(d);
		WebElement change = d
				.findElement(icon);
		a.moveToElement(change).perform();
		Thread.sleep(3000);
		d.findElement(lan).click();
	}
	
	By button1=By.id("nav-link-accountList-nav-line-1");
	By signot=By.id("nav-item-signout");
	public void signout() throws InterruptedException {
	Actions a = new Actions(d);
	WebElement change = d.findElement(button1);
	a.moveToElement(change).perform();
	Thread.sleep(3000);
	d.findElement(signot).click();
	System.out.println("log out successful");
	}
}
