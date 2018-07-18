package pages;

import io.trueautomation.client.driver.FindByTA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

public class SigninPage extends BasePage{

    public SigninPage(WebDriver driver) {
        super(driver);
    }

    @FindByTA(taName="trueautomationio:signinPage:signupBtn", how = How.CSS, using = "div.sign-up-container > a")
    public WebElement signupBtn;

    public void goToSignUpPage (){
        signupBtn.click();
    }

}