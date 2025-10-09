import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

//Amazon question: todos los dias se agregaran productos a la pagina, y los nuevos items quieren probar si pueden
//agregarlos al cart o no, entonces con ese array vas a poder agregar nuevos items

public class base2 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        //expected array
        String[] itemsNeeded = {"Cucumber", "Brocolli","Beetroot","Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        addItems(driver,itemsNeeded);
        //base b = new base();
        //b.addItems(driver,itemsNeeded);

}




    public static void addItems(WebDriver driver, String[] itemsNeeded){



        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {


            String[] name = products.get(i).getText().split("- ");
            String formattedName = name[0].trim();

            //first we have to format the actual vegetable name before using it
            //the goal is to check the name you extracted is present in array or not
            //convert array into array list for easy search
            //arrays take less memories, array list is for complicated scenarios

            List itemsNeededList = Arrays.asList(itemsNeeded);

            int j = 0;
            if (itemsNeededList.contains(formattedName)) {

                j++;
                //click on add to cart
                //aqui vamos a ponerle el boton de add to cart al elemento i que estemos buscando comprar, solo a ese
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                //we have already come in 3 times this code
                if(j==itemsNeeded.length){ //Usamos .length() para el tamaño de un array y .size() para el tamaño de un array list
                    break;
                }
            }
        }
    }

    }


