package careviso.pages.create;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SecondCaseCreationPage extends PageObject {

    @FindBy(name = "providerInfo.physicianNPI")
    private WebElementFacade physicianNPI;

    @FindBy(name = "providerInfo.physicianFirstName")
    private WebElementFacade physicianFirstName;

    @FindBy(name = "providerInfo.physicianLastName")
    private WebElementFacade physicianLastName;

    @FindBy(name = "providerInfo.physicianPracticeName")
    private WebElementFacade physicianPracticeName;

    @FindBy(name = "providerInfo.physicianPhone")
    private WebElementFacade physicianPhone;

    @FindBy(name = "providerInfo.physicianFax")
    private WebElementFacade physicianFax;

    @FindBy(name = "providerInfo.geneticCounselorName")
    private WebElementFacade physiciangeneticCounselorName;

    @FindBy(css = "form-control.form-control.input")
    private WebElementFacade date;

    @FindBy(name = "input.clinicInfo.zip")
    private WebElementFacade zipcode;

    @FindBy(id = "wizard_next")
    private WebElementFacade saveContinue;

    //Right Validate Section
    @FindBy()
    private WebElementFacade infoOrderType;

    @FindBy()
    private WebElementFacade infoMemberId;

    @FindBy()
    private WebElementFacade infoPrimaryInsurance;

    @FindBy()
    private WebElementFacade infoFullName;

    @FindBy()
    private WebElementFacade infoDate;

    @FindBy()
    private WebElementFacade infoGender;

    //Getters
    public WebElementFacade getPhysicianNPI() {
        return physicianNPI;
    }

    public WebElementFacade getPhysicianFirstName() {
        return physicianFirstName;
    }

    public WebElementFacade getPhysicianLastName() {
        return physicianLastName;
    }

    public WebElementFacade getPhysicianPracticeName() {
        return physicianPracticeName;
    }

    public WebElementFacade getPhysicianPhone() {
        return physicianPhone;
    }

    public WebElementFacade getPhysicianFax() {
        return physicianFax;
    }

    public WebElementFacade getPhysiciangeneticCounselorName() {
        return physiciangeneticCounselorName;
    }

    public WebElementFacade getDate() {
        return date;
    }

    public WebElementFacade getZipcode() {
        return zipcode;
    }

    public WebElementFacade getSaveContinue() {
        return saveContinue;
    }
}
