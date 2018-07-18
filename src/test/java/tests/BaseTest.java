package tests;

import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.PageGenerator;

public class BaseTest {
    public WebDriver driver;
    public PageGenerator page;

    @BeforeMethod
    public void setup () {
        driver = new TrueAutomationDriver();
        driver.manage().window().maximize();
        page = new PageGenerator(driver);
    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }
}
