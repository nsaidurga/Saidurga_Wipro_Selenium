package demoPack;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Student form submission by CSS selectors
public class CssSelector_Student {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		d.manage().window().maximize();

		// firstname
		WebElement fname = d.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		fname.sendKeys("SaiN");
		// lastname
		WebElement lname = d.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		lname.sendKeys("Durga");
		// email
		WebElement email = d.findElement(By.cssSelector("input[id=\"userEmail\"]"));
		lname.sendKeys("nsd@gmail.in");
		// gender
		d.findElement(By.cssSelector("label[for=\"gender-radio-1\"]")).click();

		// phone
		WebElement phone = d.findElement(By.cssSelector(""));
		phone.sendKeys("9635626262");

		// dob
		d.findElement(By.id("dateOfBirthInput")).click();
		d.findElement(By.cssSelector("select>option[value=\"2023\"]")).click();
		d.findElement(By.cssSelector("select>option[value=\"11\"]")).click();
		d.findElement(By.cssSelector("div[aria-label=\"Choose Monday, December 18th, 2023\"]")).click();

		// subject
//		WebElement sub=d.findElement(By.cssSelector("input[id=\"subjectsInput\"]"));
//		sub.sendKeys("com");
//		sub.sendKeys(Keys.ENTER);
		String[] subs = { "Math", "phy", "Eco", "Eng" };
		WebElement sub = d.findElement(By.cssSelector("input[id=\"subjectsInput\"]"));
		for (String su : subs) {
			sub.sendKeys(su);
			sub.sendKeys(Keys.ENTER);
		}

		// hobbies
		d.findElement(By.cssSelector("label[for=\"hobbies-checkbox-1\"]")).click();
		d.findElement(By.cssSelector("label[for=\"hobbies-checkbox-3\"]")).click();

		// upload picture
		WebElement photo = d.findElement(By.cssSelector("input[id=\"uploadPicture\"]"));
		photo.sendKeys("C:\\Users\\sai durga\\Downloads\\Selenium Practice Assignment.docx");

		// address
		WebElement adress = d.findElement(By.cssSelector("textarea[id=\"currentAddress\"]"));
		adress.sendKeys("Vizag");
		adress.sendKeys(Keys.ENTER);

		// state
		WebElement state = d.findElement(By.cssSelector("input[id=\"react-select-3-input\"]"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);

		// submit
		d.findElement(By.id("submit")).click();
		Thread.sleep(6000);
		System.out.println("Done");

		// TakesScreenshot ts=(TakesScreenshot)d;
		File source = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		File dest = new File("screenshot2.png");
		Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.COPY_ATTRIBUTES);
		System.out.println("Screenshot");
		
		Thread.sleep(3000);
		d.close();
	}

}
