package careviso.stepdefinitions.create;

import careviso.steps.create.CaseCreationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CaseCreationStepDefinitions {

    @Steps
    CaseCreationSteps creationSteps;

    @When("the user uses the data from {string} to create a new case")
    public void theUserUsesTheDataFromToCreateANewCase(String jsonName) {
        creationSteps.completeCaseFields(jsonName);
    }

    @Then("validate the case is created correctly")
    public void validateTheCaseIsCreatedCorrectly() {
    }

}
