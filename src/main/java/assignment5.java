import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
        //System.out.println(driver.findElements(By.tagName("frame")).size());
        //WebElement middleFrame = driver.findElement(By.xpath("//frameset[@name='frameset-middle']"));
        Thread.sleep(1500);
        driver.switchTo().frame("frame-top");
        //driver.switchTo().frame("frameset-middle");
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());


    }
}
