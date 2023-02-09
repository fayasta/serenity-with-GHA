package careviso.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import careviso.steps.PDFSteps;

public class PDFStepDefinitions {

    @Steps
    PDFSteps pdfSteps;

    @Given("the user opens the pdf")
    public void theUserOpensThePdf() {

    }

    @Then("the user validate {string} is {string}")
    public void theUserValidateIs(String fieldName, String expectedValue) {
        Assert.assertTrue(pdfSteps.verifyTextFromPDF(fieldName, expectedValue));
    }

}
