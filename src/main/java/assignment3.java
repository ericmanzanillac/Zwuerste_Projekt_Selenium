import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class assignment3 {

    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("credentials_enable_service", false);

        prefs.put("password_manager_enabled", false);

        Map<String, Object> profile = new HashMap<String, Object>();

        profile.put("password_manager_leak_detection", false);

        prefs.put("profile", profile);

        options.setExperimentalOption("prefs", prefs);


        WebDriver driver = new ChromeDriver(options);


        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));


        String[] itemsNeeded = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        w.until(ExpectedConditions.elementToBeClickable(By.id("username")));
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.xpath("//select[@class='form-control'] //option[@value='consult']")).click();
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        Thread.sleep(3000);
        addItems(driver, itemsNeeded, w);
        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();






    }


    public static void addItems(WebDriver driver, String[] itemsNeeded, WebDriverWait w) throws InterruptedException {

        int j = 0;
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-body']//h4/a"));
        for (int i = 0; i < products.size(); i++) {

//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(products.get(i).getText())) {
                j++;
//click on Add to cart
                driver.findElements(By.cssSelector("button.btn-info")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }


}


