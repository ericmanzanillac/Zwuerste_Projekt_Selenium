import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class assignment6 {
    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        Thread.sleep(1000);
        String textOption = "";

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
        for (WebElement checkbox : allCheckboxes){
            if (checkbox.isSelected()){
                textOption = checkbox.getAttribute("value");
                System.out.println(textOption);
            }
        }
        String suggestionText = "";
        String correctedDropdownText = textOption.substring(0,1).toUpperCase() + textOption.substring(1);
        List<WebElement> allSuggestions = driver.findElements(By.xpath("//select[@name='dropdown-class-example']//option"));
        for (WebElement suggestion : allSuggestions){
            suggestionText = suggestion.getText();
            if (correctedDropdownText.equals(suggestionText)){
                suggestion.click();
                System.out.println(suggestionText);
                break;
            }
        }
        WebElement inputField = driver.findElement(By.name("enter-name"));
        inputField.sendKeys(suggestionText);

        driver.findElement(By.id("alertbtn")).click();
        if (driver.switchTo().alert().getText().contains(suggestionText)) {
            System.out.println("La " + suggestionText +" está en la alerta");
        }
        else {
            System.out.println("NO");
        }
        driver.switchTo().alert().accept();
    }
}


