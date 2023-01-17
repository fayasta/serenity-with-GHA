package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class RegistrarPage extends PageObject {

    @FindBy(xpath = "//input[@ng-reflect-name='documentNumber']")
    private WebElementFacade documentNumberField;

    @FindBy(xpath = "//input[@ng-reflect-name='phone']")
    private WebElementFacade phoneField;

    @FindBy(xpath = "//input[@ng-reflect-name='name']")
    private WebElementFacade namesField;

    @FindBy(xpath = "//input[@ng-reflect-name='fatherLastName']")
    private WebElementFacade firstLastNameField;

    @FindBy(xpath = "//input[@ng-reflect-name='motherLastName']")
    private WebElementFacade secondLastNameField;

    public WebElementFacade getDocumentNumberField() {
        return documentNumberField;
    }

    public WebElementFacade getPhoneField() {
        return phoneField;
    }

    public WebElementFacade getNamesField() {
        return namesField;
    }

    public WebElementFacade getFirstLastNameField() {
        return firstLastNameField;
    }

    public WebElementFacade getSecondLastNameField() {
        return secondLastNameField;
    }
}
