package careviso.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    @FindBy()
    private WebElementFacade emailField;

    @FindBy()
    private WebElementFacade passwordField;

    @FindBy()
    private WebElementFacade otpField;

    @FindBy()
    private WebElementFacade loginButton;

    public WebElementFacade getEmailField() {
        return emailField;
    }

    public WebElementFacade getPasswordField() {
        return passwordField;
    }

    public WebElementFacade getOtpField() {
        return otpField;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }
}
