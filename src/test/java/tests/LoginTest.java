package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SigninPage;
import pages.SignupPage;

public class LoginTest extends BaseTest {

    @Test
    public void exampleTest() {
        page.GetInstance(HomePage.class).goToHomePage();
        page.GetInstance(HomePage.class).signInBtnPress();
        page.GetInstance(SigninPage.class).goToSignUpPage();
        page.GetInstance(SignupPage.class).setEmail("your@mail.com");
    }

}