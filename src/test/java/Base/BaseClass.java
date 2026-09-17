package Base;

import Utilities.ExtentReportManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    protected WebDriver driver;

    @BeforeSuite
    public void startExtentReport() {
        ExtentReportManager.startReport();
    }

    @BeforeClass
    public void launchbrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void closebrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @AfterSuite
    public void flushExtentReport() {
        ExtentReportManager.flushReport();
    }
}
