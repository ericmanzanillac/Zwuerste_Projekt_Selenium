import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

    public static void main (String[] args) {

        //Invoking Browser
        //Chrome ChromeDrive Methods
        //System.setProperty("webdriver.chrome.driver", "D:/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe" );
        //WebDriver driver = new ChromeDriver();

        //Firefox Launch
        //geckodrive
        //gecko webdriver
        //System.setProperty("webdriver.gecko.driver", "D:/Downloads/geckodriver-v0.36.0-win-aarch64/geckodriver.exe" );
        //WebDriver driver = new FirefoxDriver();


        //Edge
        System.setProperty("webdriver.edge.driver", "D:/Downloads/edgedriver_win64 (1)/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://hulldrum.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }
}