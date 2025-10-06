import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//input[@name='name']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Eric");
        driver.findElement(By.xpath("//input[@name='email']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Eric@goo.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).click();
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Eric2552");
        driver.findElement(By.id("exampleCheck1")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[text()='Male']")).click();
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("31/08/1997");
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());





    }
}

//Rahul version
/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment {
    public static void main(String[] args) {

 TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("rahul");

        driver.findElement(By.name("email")).sendKeys("hello@abc.com");

        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");

        driver.findElement(By.id("exampleCheck1")).click();

        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

        Select abc = new Select(dropdown);

        abc.selectByVisibleText("Female");

        driver.findElement(By.id("inlineRadio1")).click();

        driver.findElement(By.name("bday")).sendKeys("02/02/1992");

        driver.findElement(By.cssSelector(".btn-success")).click();

        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

    }
}*/

//Otra version que me gustó

/*WebDriver driver = new ChromeDriver();



        try {

                // Load your local HTML file (or replace with a URL)

                driver.get("file:///C:/path-to-your/form.html"); // <-- Replace with correct path



// Fill in name

            driver.findElement(By.id("name")).sendKeys("Alice");



// Fill in email

            driver.findElement(By.id("email")).sendKeys("alice@example.com");



// Fill in password

            driver.findElement(By.id("password")).sendKeys("Secret123");



// Select gender (e.g., Female)

            driver.findElement(By.id("genderFemale")).click();



// Select employment status (e.g., Employed)

            driver.findElement(By.id("employed")).click();



// Select DOB

            driver.findElement(By.id("dob")).sendKeys("1995-08-25");



// Submit the form

            driver.findElement(By.id("submitBtn")).click();



// Wait and verify the success message

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

WebElement successMsg = wait.until(

        ExpectedConditions.visibilityOfElementLocated(By.id("successMessage"))

);



// Validate message

            if (successMsg.isDisplayed() && successMsg.getText().contains("successfully")) {

        System.out.println("✅ Success! The form has been submitted successfully");

            } else {

                    System.out.println("❌ Submission message not found or incorrect.");

            }*/
