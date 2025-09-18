package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base {

    protected static WebDriver driver;
    private static final Logger log = LogManager.getLogger(Base.class);

    @BeforeSuite
    public void setup() {
        log.info("Setting up the test environment...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        log.info("Page title: {}", driver.getTitle());
        log.info("Test environment setup complete.");
    }

    @AfterSuite
    public void tearDown() {
        log.info("Tearing down test environment...");
        if (driver != null) {
            driver.quit();
            log.info("Browser closed successfully.");
        }
    }
}
