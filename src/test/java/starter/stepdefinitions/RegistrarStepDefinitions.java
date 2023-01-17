package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.steps.HomeSteps;
import starter.steps.RegistrarSteps;

public class RegistrarStepDefinitions {

    @Steps
    RegistrarSteps registrarSteps;

    @Steps
    HomeSteps homeSteps;

    @Given("El usuario abre el sitio de Yevo")
    public void elUsuarioAbreElSitioDeYevo() {
        homeSteps.openWeb();
    }

    @Then("El usuario hace click en Registrarme ahora")
    public void elUsuarioHaceClickEnRegistrarmeAhora() {
        homeSteps.clickOnRegistrarMe();
    }

    @And("El usuario completa los campos obligatorios {string}, {string}, {string}, {string}, {string}")
    public void elUsuarioCompletaLosCamposObligatorios(String documentNumber, String phone, String names, String lastName, String secondLastName) {
        registrarSteps.completeForm(documentNumber, phone, names, lastName, secondLastName);
    }
}
