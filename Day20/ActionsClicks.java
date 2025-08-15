package demoPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/* Assignment 1 – Action Class
Objective: Practice mouse and keyboard interactions.
Scenario:
Open the DemoQA site → https://demoqa.com/buttons
Perform:
Double Click on “Double Click Me” button.
Right Click on “Right Click Me” button.
Single Click on the third “Click Me” button.
Print the text messages that appear after each click action.
Extra Challenge:
Visit https://demoqa.com/dragabble and drag the element from its position to another point.
 */
public class ActionsClicks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/buttons");
		Thread.sleep(6000);
		d.manage().window().maximize();
		
		WebElement doubleclick=d.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(d);
		act.doubleClick(doubleclick).perform();
		
		Thread.sleep(6000);
		WebElement rightclick=d.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();
		
		Thread.sleep(6000);
		WebElement click=d.findElement(By.id("9V5Ri"));
		act.contextClick(click).perform();
		d.close();
		
		WebDriver w=new ChromeDriver();
		w.get("https://www.ebay.com/");
		w.manage().window().maximize();
		Actions act1=new Actions(w);
		
		WebElement motors=w.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		act1.moveToElement(motors).perform();
		Thread.sleep(3000);
//		
		WebElement sports=w.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
		act1.moveToElement(sports).perform();
		Thread.sleep(3000);
		
		WebElement fashion=w.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
		act1.moveToElement(fashion).perform();
		Thread.sleep(3000);
		w.close();	
		
		
		WebDriver d1=new ChromeDriver();	
		d1.get("https://demoqa.com/droppable");
		d1.manage().window().maximize();
		Actions act2=new Actions(d1);
		WebElement source=d1.findElement(By.id("draggable"));
		WebElement target=d1.findElement(By.id("droppable"));
		act2.dragAndDrop(source, target).perform();
		d1.close();
	}

}
