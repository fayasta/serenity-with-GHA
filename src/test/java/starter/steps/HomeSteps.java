package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.HomePage;

public class HomeSteps {

    HomePage homePage;

    @Step
    public void openWeb(){
        homePage.open();
    }

    @Step
    public void clickOnRegistrarMe(){
        homePage.getRegistrarmeButton().click();
    }

    @Step
    public boolean validateUserNameIsDisplayed(String username){
        homePage.getDriver();
        System.out.println(homePage.getDriver().getPageSource());
        return homePage.getWelcomeTitle().getText().contains(username);
    }


}
