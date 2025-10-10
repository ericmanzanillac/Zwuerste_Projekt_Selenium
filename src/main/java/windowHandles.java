import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentid, chilid, subchildId]
        Iterator<String> ite = windows.iterator();
        String parentId = ite.next();
        String childId = ite.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at"));

    }
}
