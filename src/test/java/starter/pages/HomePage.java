package starter.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://yevo-web-dev.azurewebsites.net/")
public class HomePage extends PageObject {

    @FindBy(className = "login-name wordWrap")
    private WebElementFacade miYevoButton;

    @FindBy(id = "#yevoHeader")
    private WebElementFacade yevoHomePageContainer;

    @FindBy(css = "button.primary")
    private WebElementFacade registrarmeButton;
    private By iniciarSesionOption = By.xpath("//span[@text='Iniciar sesión']");

    @FindBy(xpath = "//main//h1")
    private WebElementFacade welcomeTitle;

    public WebElementFacade getMiYevoButton() {
        return miYevoButton;
    }

    public WebElementFacade getYevoHomePageContainer() {
        return yevoHomePageContainer;
    }

    public By getIniciarSesionOption() {
        return iniciarSesionOption;
    }

    public WebElementFacade getWelcomeTitle() {
        return welcomeTitle;
    }

    public WebElementFacade getRegistrarmeButton() {
        return registrarmeButton;
    }
}
