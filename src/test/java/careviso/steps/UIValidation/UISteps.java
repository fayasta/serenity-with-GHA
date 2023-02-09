package careviso.steps.UIValidation;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import careviso.pages.UIValidation.UIPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UISteps {

    UIPage UIPage;
    String tableLocator = "./div[@class='row']";
    String tableCelLocator = "./div";

    public void open(){
        UIPage.open();
    }

    public boolean validateElementsOrderOfATable(){
        WebElementFacade caseResultsTable = UIPage.getCaseResultsTable().waitUntilVisible();
        List<WebElement> listOfRows = caseResultsTable.findElements(By.xpath(tableLocator));

        Map<Integer, List<WebElement>> mapResults = new HashMap<>();
        for (int i = 0; i < listOfRows.size(); i++) {
            List<WebElement> listOfElementsPerRow = listOfRows.get(i).findElements(By.xpath(tableCelLocator));
            mapResults.put(i,listOfElementsPerRow);
        }

        return validateOrderElementsOfAGroupPerRow(mapResults) && validateOrderElementsOfAGroupPerColumn(mapResults);

    }

    private boolean validateOrderElementsOfAGroupPerRow(Map<Integer, List<WebElement>> mapResults){
        System.out.println("=================================");
        int originPosY;
        int elementInitialToCompare;
        int width = 0;
        boolean validation = true;
        for (Map.Entry<Integer, List<WebElement>> entry : mapResults.entrySet()) {
            originPosY = entry.getValue().get(0).getLocation().getY();
            elementInitialToCompare = entry.getValue().get(0).getLocation().getX();

            for (WebElement element: entry.getValue()){
                System.out.println(originPosY + " <= " + element.getLocation().getY());
                System.out.println(elementInitialToCompare + "+" + width + "or" + (elementInitialToCompare+width)+ " <= " + element.getLocation().getX());
                if(originPosY == element.getLocation().getY() && elementInitialToCompare + width == element.getLocation().getX()){
                    elementInitialToCompare = element.getLocation().getX();
                    width = element.getSize().getWidth();
                }else{
                    validation = false;
                }
                System.out.println(entry.getKey()+" : "+element.getLocation().getY() + element.findElement(By.xpath("./label")).getText());
                System.out.println("=================================");
            }
            width = 0;
        }

        System.out.println("=================================");
        return validation;
    }

    private boolean validateOrderElementsOfAGroupPerColumn(Map<Integer, List<WebElement>> mapResults){
        System.out.println("=================================");
        int originPosX;
        int elementInitialToCompare;
        int height = 0;
        boolean validation = true;
        for (int i = 0; i < mapResults.get(0).size(); i++) { //3 columns
            originPosX = mapResults.get(0).get(i).getLocation().getX();
            elementInitialToCompare = mapResults.get(0).get(i).getLocation().getY();
            for (int j = 0; j < mapResults.entrySet().size(); j++) { //4 rows
                System.out.println(originPosX + " <= " + mapResults.get(j).get(i).getLocation().getX());
                System.out.println(elementInitialToCompare + "+" + height + "or" + (elementInitialToCompare+height)+ " <= " + mapResults.get(j).get(i).getLocation().getY());

                if(originPosX == mapResults.get(j).get(i).getLocation().getX() &&
                        elementInitialToCompare + height == mapResults.get(j).get(i).getLocation().getY()){
                    elementInitialToCompare = mapResults.get(j).get(i).getLocation().getY();
                    height = mapResults.get(j).get(i).getSize().getHeight();
                }else{
                    validation = false;
                }
                System.out.println("=======>" + mapResults.get(j).get(i).findElement(By.xpath("./label")).getText());

            }
            height = 0;
            System.out.println("=================================");
        }


        System.out.println("=================================");
        return validation;
    }

}
