package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.trueautomation.client.driver.FindByTA;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://trueautomation.io";

    @FindByTA(taName="trueautomationio:homePage:loginBtn", how = How.CSS, using = "a.login-btn")
    public WebElement loginBtn;

    public void goToHomePage (){
        driver.get(baseURL);
    }

    public SigninPage signInBtnPress() {
        loginBtn.click();
        return new PageFactory().initElements(driver,SigninPage.class);
    }
}
