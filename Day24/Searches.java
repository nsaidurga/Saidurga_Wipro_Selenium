package ttestpack2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Searches {
	WebDriver d;

	@BeforeClass
	public void beforeClass() {
		d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		
	}

	@Test(enabled = true)
	public void name() {
		System.out.println("Name : Saidurga");
	}

	@Test(enabled = false)
	public void address() {
		System.out.println("Adress is Vizag, India");
	}

	//multiples of search
	@Test(invocationCount = 3)
	public void repeat() {
		d.get("https://www.amazon.com");
		By searchItem = By.id("twotabsearchtextbox");
		List<String> l = new ArrayList<>();
		l.add("Watch");
		for (String s : l) {
			WebElement search = d.findElement(searchItem);
			search.clear();
			search.sendKeys(s);
			search.sendKeys(Keys.ENTER);
		}
	}

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}

