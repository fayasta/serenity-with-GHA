package dataReaders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import careviso.caseModel.Case;
import com.google.gson.Gson;

public class JsonDataReader {
    private final String jsonPath = "src/test/resources/jsons/";
    private final String caseCreationPath = "creation/";

    public Case getCustomerData(String jsonName) {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        String customerFilePath = jsonPath+caseCreationPath+jsonName;
        try {
            bufferReader = new BufferedReader(new FileReader(customerFilePath));
            Case caseJson = gson.fromJson(bufferReader, Case.class);
            return caseJson;
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + customerFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

//    public final Case getCaseByLabId(String labId){
//        return caseList.stream().filter(x -> x.labId.equalsIgnoreCase(labId)).findAny().get();
//    }

}
