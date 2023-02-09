package careviso.stepdefinitions.login;

import careviso.steps.login.LoginSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("The user is full authenticated")
    public void theUserIsFullAuthenticated() {
        loginSteps.completeLoginForm();
    }

}
