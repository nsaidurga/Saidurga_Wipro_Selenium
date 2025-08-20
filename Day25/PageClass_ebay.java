package miniProjt;

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

public class PageClass_ebay {
	WebDriver d;
	WebDriverWait wait;

	public PageClass_ebay(WebDriver d) {
		this.d = d;
		this.wait = new WebDriverWait(d, Duration.ofSeconds(10));
	}

	By signLink = By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a");
	By id = By.id("userid");
	By continuee = By.id("signin-continue-btn");

	public void email_in() {
		d.findElement(signLink).click();
		WebElement email = d.findElement(id);
		email.click();
		email.clear();
		email.sendKeys("iamalonekingg028576@gmail.com");
		d.findElement(continuee).click();
	}

	public void password() {
		WebElement password = d.findElement(By.id("pass"));
		password.sendKeys("King@123#");
		d.findElement(By.id("sgnBt")).click();
	}

	By sea = By.id("gh-ac");

	public void search() {
		List<String> l = new ArrayList<>();
		l.add("Watch");
		l.add("Shoes");
		l.add("Books");
		for (String s : l) {
			WebElement search = d.findElement(sea);
			search.click();
			search.clear();
			search.sendKeys(s);
			search.sendKeys(Keys.ENTER);
		}
	}

	By first = By.xpath("(//div[@id='srp-river-results']//a[contains(@class,'s-item__link')])[1]");
	By add = By.id("atcBtn_btn_1");
	By cart = By.xpath(
			"//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a");
	By remove = By.id("cart-remove-item");

	public void addCart() throws InterruptedException {
		WebElement search = d.findElement(sea);
		search.click();
		search.clear();
		search.sendKeys("Watches");
		search.sendKeys(Keys.ENTER);
		for (int i = 0; i < 1; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
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
		d.findElement(add).click();
		Thread.sleep(3000);
		d.findElement(cart).click();
		d.findElement(remove).click();
	}

	By cl = By.xpath("//*[@id=\"gh\"]/nav/div[2]/div[5]/div/a/span");
	By del = By.xpath(
			"//*[@id=\"mainContent\"]/div/div[3]/div[1]/div[1]/div[1]/ul/li/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/span/span/button[2]");

	public void deletecart() throws InterruptedException {
		Thread.sleep(4000);
		d.findElement(cl).click();
		d.findElement(del).click();
	}

	By ref = By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span/span");
	By acc = By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a");
	By per = By.linkText("Personal information");
	By uedit = By.id("individual_username_edit_button");
	By un = By.id("user_name");
	By sub = By.id("username_submit_edit_btn");

	public void changename() throws InterruptedException {
		Actions a = new Actions(d);
		WebElement change = d.findElement(ref);
		a.moveToElement(change).perform();
		Thread.sleep(4000);
		d.findElement(acc).click();
		Thread.sleep(5000);
		d.findElement(per).click();
		// d.findElement(By.xpath("")).click();
		Thread.sleep(2000);
		d.findElement(uedit).click();
		Thread.sleep(2000);
		WebElement username = d.findElement(un);
		username.click();
		username.clear();
		username.sendKeys("Saidurga");
		Thread.sleep(1000);
		d.findElement(sub).click();
	}

	By adres = By.linkText("Addresses");
	By temp = By.xpath(
			"//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[2]/div/div[2]/a");
	By editAdres = By.id("edit-address-SHIPPING");
	By uadres = By.cssSelector("input[name=\"addressLine2-field\"]");
	By savadres = By.id("save-address-btn");

	public void changeadress() throws InterruptedException {
		Actions a = new Actions(d);
		WebElement change = d.findElement(ref);
		a.moveToElement(change).perform();
		Thread.sleep(4000);
		d.findElement(acc).click();
		Thread.sleep(5000);
		d.findElement(adres).click();
		Thread.sleep(2000);
		d.findElement(temp).click();
		Thread.sleep(2000);
		d.findElement(editAdres).click();
		WebElement userAdress = d.findElement(uadres);
		userAdress.click();
		userAdress.clear();
		userAdress.sendKeys("addagutta colony, kukatpally, Hyderabad");
		Thread.sleep(1000);
		d.findElement(savadres).click();
	}

	By s = By.id("gh-cat");
	By clik = By.xpath("//*[@id=\"gh-search-btn\"]/span");
	By tel = By.linkText("Home Telephones & Accessories");
	By ma = By.linkText("Answering Machines");
	By pro = By.linkText("Vtg PALSTAR 8301 Cassette Tape Answering Machine VOX Record A Call TELECOM");

	public void selectcategory() throws InterruptedException {
		WebElement sea = d.findElement(s);
		sea.click();
		sea.sendKeys("Consumer Electronics");
		d.findElement(clik).click();
		Thread.sleep(3000);
		d.findElement(tel).click();
		Thread.sleep(3000);
		d.findElement(ma).click();
		Thread.sleep(3000);
		d.findElement(pro).click();
	}

	By sbar = By.id("gh-ac");

	By firstPro = By.xpath("(//div[@id='srp-river-results']//a[contains(@class,'s-item__link')])[1]");

	public void proddetails() throws InterruptedException {
		WebElement search = d.findElement(sbar);
		search.click();
		search.clear();
		search.sendKeys("Mobiles");
		search.sendKeys(Keys.ENTER);
		// Thread.sleep(9000);
		for (int i = 0; i < 1; i++) {
			((JavascriptExecutor) d).executeScript("window.scrollBy(0, 300);");
			Thread.sleep(3000);
		}
		Thread.sleep(4500);
		WebElement firstProduct = d.findElement(firstPro);
		String original = d.getWindowHandle();
		firstProduct.click();
		for (String w : d.getWindowHandles()) {
			if (!w.equals(original)) {
				d.switchTo().window(w);
				break;
			}
		}
	}

	By se = By.id("gh-cat");
	By cll = By.xpath("//*[@id=\"gh-search-btn\"]/span");

	public void selbyall() throws InterruptedException {
		WebElement sea = d.findElement(se);
		sea.click();
		sea.sendKeys("All Categories");
		d.findElement(cll).click();
	}
	
	By b1=By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button");
	By b2=By.linkText("India");
	By b3=By.id("onetrust-accept-btn-handler");
	By b4=By.cssSelector("span[class=\"region-chooser__text\"]");
	By b5=By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div[1]/form/div/div[2]/div/div[1]");
	By b6=By.cssSelector("button[class=\"btn region-popup__button btn btn--button\"]");
	public void chnglanguage() throws InterruptedException {
		for (int i = 0; i < 6; i++) {
		    ((JavascriptExecutor) d).executeScript("window.scrollBy(0, 500);");
		    Thread.sleep(1000);
		}
		Actions a = new Actions(d);
		Thread.sleep(5000);
		WebElement change = d.findElement(b1);
		a.moveToElement(change).perform();
		d.findElement(b2).click();
		d.findElement(b3).click();
		Thread.sleep(2000);
		d.findElement(b4).click();
		Thread.sleep(2000);
		WebElement sel=d.findElement(b5);
		sel.click();
		Thread.sleep(2000);
		sel.sendKeys("India");
		sel.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(b6).click();
	}
}
