package careviso.steps.login;

import careviso.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPage loginPage;
    private String username = "user@email.com";
    private String password = "password";

    @Step
    public void completeLoginForm(){
        loginPage.getEmailField().sendKeys(username);
        loginPage.getPasswordField().sendKeys(password);
        waitToCompleteOPT();
    }


    private void waitToCompleteOPT(){

    }
}
