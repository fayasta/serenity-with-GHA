package careviso.steps;

import careviso.pages.NavigationMenuPage;

public class NavigationSteps {

    NavigationMenuPage navigationMenuPage;

    public void clickOnNewCaseButton(){
        navigationMenuPage.getNewCaseButton().click();
    }



}
