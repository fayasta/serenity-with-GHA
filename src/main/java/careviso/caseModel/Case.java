package careviso.caseModel;

import java.util.Arrays;

public class Case {
    public String claimNumber;
    public String labId;
    public String labClinicId;
    public String caseType;
    public String createdAt;
    public String postServiceReview;
    public String otherClinicalInfo;
    public Patient patient;
    public Provider provider;
    public Test test;
    public PrimaryInsurance primaryInsurance;
    public LabOrder labOrder;
    public SupplementalDocument[] supplementalDocument;

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public String getLabClinicId() {
        return labClinicId;
    }

    public void setLabClinicId(String labClinicId) {
        this.labClinicId = labClinicId;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPostServiceReview() {
        return postServiceReview;
    }

    public void setPostServiceReview(String postServiceReview) {
        this.postServiceReview = postServiceReview;
    }

    public String getOtherClinicalInfo() {
        return otherClinicalInfo;
    }

    public void setOtherClinicalInfo(String otherClinicalInfo) {
        this.otherClinicalInfo = otherClinicalInfo;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public PrimaryInsurance getPrimaryInsurance() {
        return primaryInsurance;
    }

    public void setPrimaryInsurance(PrimaryInsurance primaryInsurance) {
        this.primaryInsurance = primaryInsurance;
    }

    public LabOrder getLabOrder() {
        return labOrder;
    }

    public void setLabOrder(LabOrder labOrder) {
        this.labOrder = labOrder;
    }

    public SupplementalDocument[] getSupplementalDocument() {
        return supplementalDocument;
    }

    public void setSupplementalDocument(SupplementalDocument[] supplementalDocument) {
        this.supplementalDocument = supplementalDocument;
    }

    @Override
    public String toString() {
        return "Case{" +
                "claimNumber='" + claimNumber + '\'' +
                ", labId='" + labId + '\'' +
                ", labClinicId='" + labClinicId + '\'' +
                ", caseType='" + caseType + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", postServiceReview='" + postServiceReview + '\'' +
                ", otherClinicalInfo='" + otherClinicalInfo + '\'' +
                ", patient=" + patient +
                ", provider=" + provider +
                ", test=" + test +
                ", primaryInsurance=" + primaryInsurance +
                ", labOrder=" + labOrder +
                ", supplementalDocument=" + Arrays.toString(supplementalDocument) +
                '}';
    }
}
