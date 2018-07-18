package pages;

import io.trueautomation.client.driver.FindByTA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPage extends BasePage{

    public SigninPage(WebDriver driver) {
        super(driver);
    }

    @FindByTA(taName="signupBtn", css = "div.sign-up-container > a")
    public WebElement signupBtn;

    public void goToSignUpPage (){
        signupBtn.click();
    }

}