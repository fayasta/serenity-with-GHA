package careviso.stepdefinitions;

import careviso.steps.NavigationSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class NavigationStepDefinitions {

    @Steps
    NavigationSteps navigationSteps;
    @Given("the user clicks on New Case button")
    public void theUserClicksOnNewCaseButton() {
        navigationSteps.clickOnNewCaseButton();
    }

}
