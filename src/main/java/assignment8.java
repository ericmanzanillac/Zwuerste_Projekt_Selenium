import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class assignment8 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("GER");
        Thread.sleep(1000);
        List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='ui-menu-item'] /div"));
        for (WebElement elements : suggestions){
            if (elements.getText().equalsIgnoreCase("Germany")){
                elements.click();
                break;
            }
        }
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.id("autocomplete"));
        String countrySelected = country.getAttribute("value");
        System.out.println(countrySelected);
    }
}