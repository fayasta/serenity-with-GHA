package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.Twilio.TwilioConnection;
import starter.steps.MFASteps;

public class MFAStepDefinitions {


    @Steps
    MFASteps mfaSteps;


    @Given("the user opens microsoft")
    public void theUserOpensMicrosoft() {
        mfaSteps.openMicrosoft();
    }

    @Then("complete the login with {string} and {string}")
    public void completeTheLoginWithAnd(String email, String password) {
        //TwilioConnection.generateOneTimePassword();
        //TwilioConnection.try2();
        mfaSteps.completeEmailPassword(email,password);
        System.out.println();
    }
}
