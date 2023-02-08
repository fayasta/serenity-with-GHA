package starter.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://login.microsoftonline.com/")
public class MFAPage extends PageObject {

    @FindBy(name = "loginfmt")
    private WebElementFacade emailField;

    private By nextButtonLocator = By.xpath("//input[@value='Next']");
    private By submitButtonLocator = By.xpath("//input[@value='Sign in']");
    private By passwordLocator = By.id("i0118");

    public WebElementFacade getEmailField() {
        return emailField;
    }

    public By getNextButtonLocator() {
        return nextButtonLocator;
    }

    public By getSubmitButtonLocator() {
        return submitButtonLocator;
    }

    public By getPasswordLocator() {
        return passwordLocator;
    }
}
