package careviso.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
public class NavigationMenuPage extends PageObject{

    @FindBy(id = "new-case-button")
    private WebElementFacade newCaseButton;

    @FindBy(css = "nav ul.nav")
    private WebElementFacade listOfMenuOptions;

    public WebElementFacade getNewCaseButton() {
        return newCaseButton;
    }

    public WebElementFacade getListOfMenuOptions() {
        return listOfMenuOptions;
    }
}
