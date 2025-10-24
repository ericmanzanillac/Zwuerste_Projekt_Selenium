import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class SSLCheck {
    WebDriver driver;
    private static ChromeOptions options;
    private static Proxy proxy;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        proxy.setHttpProxy("ipaddress:4444");
        options.setCapability("proxy", proxy );
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        options.setExperimentalOption("prefs", prefs);


    }
    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver(options);

    }

    @AfterEach
    void teardown() {
        //driver.quit();
    }

    @Test
    public void webDriverManagerTest() throws InterruptedException {
        driver.get("https://expired.badssl.com/");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

    }
}
