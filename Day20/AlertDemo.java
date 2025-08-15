package demoPack;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* Assignment 3 – Alerts
Objective: Handle different types of alerts.
Scenario:
Open the DemoQA site → https://demoqa.com/alerts
Perform:
Click the button to see an alert, accept it.
Click the “On button click, confirm box will appear” button, dismiss the alert.
Click the “Prompt Box” button, enter your name, and accept it.
Capture and print the alert messages before accepting/dismissing.
Extra Challenge:
Wait dynamically for the alert that appears after 5 seconds, then accept it.
 */
public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		d.manage().window().maximize();
		
		WebElement seealert=d.findElement(By.id("alertButton"));
		seealert.click();
		Thread.sleep(4000);
		Alert alert=d.switchTo().alert();
		alert.accept();
		
		Thread.sleep(4000);
		
		WebElement timealert=d.findElement(By.id("timerAlertButton"));
		timealert.click();
		Thread.sleep(6000);
		Alert alert1=d.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(3000);
		
		WebElement confirmalert=d.findElement(By.id("confirmButton"));
		confirmalert.click();
		Thread.sleep(4000);
		Alert alert2=d.switchTo().alert();
		alert2.dismiss();
		
		Thread.sleep(3000);
		
		WebElement promptalert=d.findElement(By.id("promtButton"));
		promptalert.click();
		Thread.sleep(3000);
		Alert alert3=d.switchTo().alert();
		alert3.sendKeys("NSD");
		alert3.accept();
		
		Thread.sleep(3000);
		d.close();
	}

}
