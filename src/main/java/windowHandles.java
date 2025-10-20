import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentid, chilid, subchildId]
        Iterator<String> ite = windows.iterator();
        String parentId = ite.next();
        String childId = ite.next();
        driver.switchTo().window(childId);
        String email = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        Thread.sleep(1500);
        driver.findElement(By.id("username")).sendKeys(email);


    }
}
