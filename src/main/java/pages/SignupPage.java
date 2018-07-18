package pages;

import io.trueautomation.client.driver.FindByTA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

public class SignupPage extends BasePage{

    public SignupPage(WebDriver driver) {
        super(driver);
    }

//    @FindByTA(taName="emailFl", name = "email")
    @FindByTA(taName="trueautomationio:signupPage:username", how = How.NAME, using = "email")
    public WebElement emailFl;

    public void setEmail (String email) {
        emailFl.sendKeys(email);
        }

}