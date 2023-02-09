package careviso.steps.create;

import careviso.caseModel.Case;
import careviso.pages.create.FirstCaseCreationPage;
import careviso.pages.create.SecondCaseCreationPage;
import careviso.pages.create.ThirdCaseCreationPage;
import dataReaders.JsonDataReader;
import net.thucydides.core.annotations.Step;

public class CaseCreationSteps {

    FirstCaseCreationPage firstCaseCreationPage;
    private Case generateCaseJson(String jsonName){
        JsonDataReader jsonDataReader = new JsonDataReader();
        Case caseData = jsonDataReader.getCustomerData(jsonName);
        System.out.println(caseData.toString());
        return caseData;
    }

    @Step
    public void completeCaseFields(String jsonName){
        Case caseData = generateCaseJson(jsonName);

        completeProviderPracticeInfo(caseData);
        completeTestRequestsInfo(caseData);
        //ToDo assert
    }

    private void completeProviderPracticeInfo(Case caseData){
        SecondCaseCreationPage secondCaseCreationPage = new SecondCaseCreationPage();
        secondCaseCreationPage.getPhysicianNPI().sendKeys(caseData.provider.npi);
        secondCaseCreationPage.getPhysicianFirstName().sendKeys(caseData.patient.firstName);
        secondCaseCreationPage.getPhysicianLastName().sendKeys(caseData.patient.lastName);
        secondCaseCreationPage.getPhysicianPracticeName().sendKeys(caseData.provider.practiceName);
        secondCaseCreationPage.getPhysicianPhone().sendKeys(caseData.patient.phoneNumber);
        secondCaseCreationPage.getPhysicianFax().sendKeys(caseData.provider.faxNumber);
        secondCaseCreationPage.getPhysiciangeneticCounselorName().sendKeys();
        secondCaseCreationPage.getDate().sendKeys(caseData.patient.dob);
        secondCaseCreationPage.getZipcode().sendKeys(caseData.patient.zip);
        secondCaseCreationPage.getSaveContinue().click();
    }

    private void completeTestRequestsInfo(Case caseData){
        ThirdCaseCreationPage thirdCaseCreationPage = new ThirdCaseCreationPage();
        thirdCaseCreationPage.getDateOfService().sendKeys(caseData.labOrder.serviceDate);
        thirdCaseCreationPage.getCollectionDate().sendKeys(caseData.labOrder.collectionDate);
        thirdCaseCreationPage.getClinicId().sendKeys(caseData.labClinicId);
        thirdCaseCreationPage.getCollectionType().sendKeys(caseData.labOrder.collectionType);
        thirdCaseCreationPage.getAccessionDate().sendKeys(caseData.labOrder.accessionDate);
        thirdCaseCreationPage.getSubmit().click();
    }

}
