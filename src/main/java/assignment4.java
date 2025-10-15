import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class assignment4 {
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li/a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//div/a[text()='Click Here']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parentId = iterator.next();
        String childId = iterator.next();
        driver.switchTo().window(childId);
        Thread.sleep(2500);
        System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//div/h3[text()='Opening a new window']")).getText());

    }
}
