import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class assignment7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        List<WebElement> rowsTable1 = driver.findElements(By.xpath("//table[@name='courses']//tbody/*"));
        System.out.println(Integer.parseInt(String.valueOf(rowsTable1.size())));
        List<WebElement> columnsTable1 = driver.findElements(By.xpath("//table[@name='courses']//tbody//tr[1]/*"));
        System.out.println(Integer.parseInt(String.valueOf(columnsTable1.size())));
        List<WebElement> secondRowTable1 = driver.findElements(By.xpath("//table[@name='courses']//tbody//tr[3]/*"));
        for (int i = 0; i<secondRowTable1.size(); i++){
            System.out.println(secondRowTable1.get(i).getText().trim());
        }
    }
}
