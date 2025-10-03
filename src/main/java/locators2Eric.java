import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class locators2Eric {

    public static void main(String[] args) throws InterruptedException {

        String name = "rahul";
        System.setProperty("webdriver.chrome.driver", "D:/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //implicit wait - 5 sec -
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String password = getPassword(driver, wait);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(3000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        Thread.sleep(1000);
        driver.findElement(By.xpath(("//button[@class='logout-btn']"))).click();
        Thread.sleep(3000);
        driver.close();


    }

    public static String getPassword(WebDriver driver, WebDriverWait wait){

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".reset-pwd-btn")));
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
        //0th index is: Please use temporary password
        //1st index is: rahuelshettyacademy' to Login

        //Aqui seleccionamos el 1 donde esta la contraseña
        String password = passwordArray[1].split("'")[0];
        return password;
        //0th index is: rahuelshettyacademy
        //1st index is: to Login






    }
}
