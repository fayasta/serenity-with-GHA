package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.RegistrarPage;

public class RegistrarSteps {


    RegistrarPage registrarPage;

    @Step
    public void openWeb(){
        registrarPage.open();
    }

    @Step
    public void completeForm(String documentNumber, String phone, String name, String lastName, String secondLastName){
        registrarPage.getDocumentNumberField().sendKeys(documentNumber);
        registrarPage.getPhoneField().sendKeys(phone);
        registrarPage.getNamesField().sendKeys(name);
        registrarPage.getFirstLastNameField().sendKeys(lastName);
        registrarPage.getSecondLastNameField().sendKeys(secondLastName);
    }
}
