package starter.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.pages.MFAPage;

import java.time.Duration;

public class MFASteps {

    MFAPage mfaPage;

    @Step
    public void openMicrosoft(){
        mfaPage.open();
    }

    @Step
    public void completeEmailPassword(String email, String password){
        mfaPage.getEmailField().waitUntilEnabled().sendKeys(email);
        WebDriverWait wait = new WebDriverWait(mfaPage.getDriver(), 20);

        wait.until(ExpectedConditions.presenceOfElementLocated(mfaPage.getNextButtonLocator()));
        mfaPage.getDriver().findElement(mfaPage.getNextButtonLocator()).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(mfaPage.getPasswordLocator()));
        mfaPage.getDriver().findElement(mfaPage.getPasswordLocator()).sendKeys(password);

        wait.until(ExpectedConditions.presenceOfElementLocated(mfaPage.getSubmitButtonLocator()));
        wait.until(ExpectedConditions.elementToBeClickable(mfaPage.getSubmitButtonLocator()));
        mfaPage.getDriver().findElement(mfaPage.getSubmitButtonLocator()).click();
    }



}
