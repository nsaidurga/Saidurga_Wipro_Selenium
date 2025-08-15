package demoPack;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/* Assignment 2 – Select Class
Objective: Work with dropdowns and multi-select options.
Scenario:
Open the DemoQA site → https://demoqa.com/select-menu
Perform:
Select “Blue” from the old-style dropdown.
Select multiple options from the multi-select dropdown (e.g., “Green”, “Yellow”, “Black”).
Verify and print the selected options.
Extra Challenge:
Select options using both selectByVisibleText and selectByIndex.
 */
public class SelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver d = new ChromeDriver();
        d.get("https://demoqa.com/select-menu");
        d.manage().window().maximize();
        Thread.sleep(2000);

        // Single select 
        WebElement select = d.findElement(By.id("oldSelectMenu"));
        Select s = new Select(select);
        s.selectByVisibleText("Yellow");
        s.selectByIndex(0);
        
        // Multi select 
        WebElement multiSelect = d.findElement(By.id("react-select-4-input"));
        multiSelect.sendKeys("Blue");
        multiSelect.sendKeys(Keys.ENTER);

        multiSelect.sendKeys("Black");
        multiSelect.sendKeys(Keys.ENTER);

        Thread.sleep(6000);
        d.quit();
    }
}
