import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class base {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        //expected array
        String[] itemsNeeded = {"Cucumber", "Brocolli"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {


            String[] name = products.get(i).getText().split("- ");
            String formattedName = name[0].trim();

            //first we have to format the actual vegetable name before using it
            //the goal is to check the name you extracted is present in array or not
            //convert array into array list for easy search
            //arrays take less memories, array list is for complicated scenarios

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {

                //click on add to cart
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

            }
        }
    }
}
