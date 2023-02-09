package careviso.caseModel;

public class LabOrder {

    public String labOrderId;
    public String collectionType;
    public String collectionDate;
    public String serviceDate;
    public String accessionDate;
    public String[] icd10Codes;

    public String getLabOrderId() {
        return labOrderId;
    }

    public void setLabOrderId(String labOrderId) {
        this.labOrderId = labOrderId;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(String collectionType) {
        this.collectionType = collectionType;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getAccessionDate() {
        return accessionDate;
    }

    public void setAccessionDate(String accessionDate) {
        this.accessionDate = accessionDate;
    }

    public String[] getIcd10Codes() {
        return icd10Codes;
    }

    public void setIcd10Codes(String[] icd10Codes) {
        this.icd10Codes = icd10Codes;
    }
}
