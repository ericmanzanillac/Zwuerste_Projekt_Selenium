import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutoSuggestive {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2500);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
        for(WebElement elements : options) { //dame una opcion de options
            if(elements.getText().equalsIgnoreCase("India")){
                elements.click();
                break;}
            //This is how to handle auto suggest dropdowns


        }
        }
    }