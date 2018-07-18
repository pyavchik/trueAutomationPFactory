package pages;

import io.trueautomation.client.driver.FindByTA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
    WebDriver driver;


    @FindByTA(taName="trueautomationio:signinPage:signupBtn", how = How.CSS, using = "div.sign-up-container > a")
    public WebElement signupBtn;

    public SigninPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToSignUpPage (){
        signupBtn.click();
    }

}