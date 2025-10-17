import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class assignment6 {
    public static void main(String[]args) throws InterruptedException {

        //Give me the count of links on the page
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        Thread.sleep(1000);

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
        for (WebElement checkbox : allCheckboxes){
            if (checkbox.isSelected()){
                String textOption = checkbox.getAttribute("value");
                System.out.println(textOption);
            }
        }
        driver.findElement(By.xpath("div//[@class='dropdown-class-example']//option[text()='Option']"));

    }
}



        /*System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement row = driver.findElement(By.xpath("//div[@id='content']/div[@class='row']"));
        System.out.println(row.findElements(By.tagName("a")).size())+++;

//First column

        WebElement macBook = row.findElement(By.xpath("//div[1]/div[@class='product-thumb transition']"));
        System.out.println(macBook.findElements(By.tagName("a")).size());

        //click each link in the column and check if its opening
        for(int i = 1; i<macBook.findElements(By.tagName("a")).size(); i++) {

            String onclickTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            macBook.findElements(By.tagName("a")).get(i).sendKeys(onclickTab);
            Thread.sleep(5000L);
        }

        Set<String> tabsIte = driver.getWindowHandles();
        Iterator<String> iterator = tabsIte.iterator();

        while(iterator.hasNext()){
            driver.switchTo().window(iterator.next());
            System.out.println(driver.getTitle());*/
/*}*/

