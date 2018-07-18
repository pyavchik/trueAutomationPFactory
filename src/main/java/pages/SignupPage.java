package pages;

import io.trueautomation.client.driver.FindByTA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    WebDriver driver;

    @FindByTA(taName="trueautomationio:signupPage:username", how = How.NAME, using = "email")
    public WebElement emailFl;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setEmail (String email) {
        emailFl.sendKeys(email);
        }

}