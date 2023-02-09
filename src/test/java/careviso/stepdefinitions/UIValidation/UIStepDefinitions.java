package careviso.stepdefinitions.UIValidation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import careviso.steps.UIValidation.UISteps;

public class UIStepDefinitions {

    @Steps
    UISteps UISteps;
    @Given("El usuario abre la pagina de ejemplo")
    public void elUsuarioAbreLaPaginaDeEjemplo() {
        UISteps.open();
    }

    @Then("Se valida que los componentes no se sobre muestren")
    public void seValidaQueLosComponentesNoSeSobreMuestren() {
        Assert.assertTrue(UISteps.validateElementsOrderOfATable());
    }
}
