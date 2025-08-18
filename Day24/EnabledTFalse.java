package ttestpack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnabledTFalse {
	WebDriver d;

	@BeforeClass
	public void beforeClass() {
		d = new ChromeDriver();
		d.get("https://www.selenium.dev/");
		d.manage().window().maximize();
	}

	@Test(enabled=true)
	public void title() throws NullPointerException{
		String etitle="Selenium";
		String atitle=d.getTitle();
		Assert.assertEquals(atitle, etitle,"Title validation fails");
		System.out.println("Expected title: "+etitle);
		System.out.println("Actual title: "+atitle);
	}
	
	@Test(enabled=false)
	public void url() {
		String eurl="https://www.selenium.dev/";
		String aurl=d.getCurrentUrl();
		Assert.assertEquals(aurl, eurl,"url validation fails");
		System.out.println("Expected title: "+eurl);
		System.out.println("Actual title: "+aurl);
	}
	@AfterClass
	public void afterClass() {
		d.close();
	}
}
