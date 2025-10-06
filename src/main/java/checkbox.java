import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
//TestNG is one of the testing libraries to build test frameworks
//El assertion ayuda a validar los resultados que tenemos

public class checkbox {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
        driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
        System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());


        //forma de contar el numero de checkboxes

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

        //otra forma de assertions es:
        // Assert.assertEquals("espero 5 usuarios", "obtengo 6 usuarios, no pasa el assertion");

        //leccion 64 extra

        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());





    }
}
