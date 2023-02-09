package careviso.caseModel;

import java.lang.reflect.Array;

public class Test {

    public String[] testNames;
    public String[] cptCodes;
    public String[] testIdentifiers;
    public String testType;

    public String[] getTestNames() {
        return testNames;
    }

    public void setTestNames(String[] testNames) {
        this.testNames = testNames;
    }

    public String[] getCptCodes() {
        return cptCodes;
    }

    public void setCptCodes(String[] cptCodes) {
        this.cptCodes = cptCodes;
    }

    public String[] getTestIdentifiers() {
        return testIdentifiers;
    }

    public void setTestIdentifiers(String[] testIdentifiers) {
        this.testIdentifiers = testIdentifiers;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }
}
