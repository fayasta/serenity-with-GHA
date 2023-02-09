package careviso.pages.create;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ThirdCaseCreationPage extends PageObject {


    @FindBy(css = "input[name='testInfo.dateOfService'] ~ input")
    private WebElementFacade dateOfService;

    @FindBy(css = "input[name='testInfo.collectionDate'] ~ input")
    private WebElementFacade collectionDate;

    @FindBy(name = "testInfo.externalClinicId")
    private WebElementFacade clinicId;

    @FindBy(name = "testInfo.collectionType")
    private WebElementFacade collectionType;

    @FindBy(css = "input[name='requestInfo.accessionDate'] ~ input")
    private WebElementFacade accessionDate;

    @FindBy(name = "requestInfo.orderId")
    private WebElementFacade labOrderId;

    @FindBy(id = "wizard_next")
    private WebElementFacade submit;

    public WebElementFacade getDateOfService() {
        return dateOfService;
    }

    public WebElementFacade getCollectionDate() {
        return collectionDate;
    }

    public WebElementFacade getClinicId() {
        return clinicId;
    }

    public WebElementFacade getCollectionType() {
        return collectionType;
    }

    public WebElementFacade getAccessionDate() {
        return accessionDate;
    }

    public WebElementFacade getLabOrderId() {
        return labOrderId;
    }

    public WebElementFacade getSubmit() {
        return submit;
    }
}
