package starter.pages.UIValidation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("file:///Users/fayasta/Downloads/temporal_sereity_jorge/index.html")
public class UIPage extends PageObject {

    @FindBy(className = "card-body")
    private WebElementFacade caseResultsTable;

    public WebElementFacade getCaseResultsTable() {
        return caseResultsTable;
    }
}
