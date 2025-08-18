package ttestpack2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageClass {

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

	public LoginPageClass(WebDriver d) {
		this.d = d;
		this.wait = new WebDriverWait(d, Duration.ofSeconds(10));
	}

	public void email_in() {
		//d.findElement(begin).click();
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
		By searchItem = By.id("twotabsearchtextbox");
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
	public void logout() throws InterruptedException {
		Actions a = new Actions(d);
		WebElement change = d.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(change).perform();
		Thread.sleep(3000);
		d.findElement(By.id("nav-item-signout")).click();
	}
}
