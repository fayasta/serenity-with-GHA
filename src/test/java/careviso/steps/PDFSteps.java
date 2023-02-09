package careviso.steps;

import net.thucydides.core.annotations.Step;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class PDFSteps {

    String pdfUrl = "./src/test/resources/pdfs/BenefitsInvestigationResults-2023-01-11.pdf";
    @Step
    public boolean verifyTextFromPDF(String fieldName, String expectedValue){
        try {
            String pdfContent=getPdfContent(pdfUrl);
            return pdfContent.contains(expectedValue);
        }catch (IOException e){
            System.out.println("FAILED - EXCEPTION");
            return false;
        }
    }
    public static String getPdfContent(String path) throws IOException {

        //Loading an existing document
        PDDocument document = PDDocument.load(new File(path));

        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
        stripper.setSortByPosition(true);

        PDFTextStripper tStripper = new PDFTextStripper();

        String pdfFileInText = tStripper.getText(document);

        return pdfFileInText;

    }

}
