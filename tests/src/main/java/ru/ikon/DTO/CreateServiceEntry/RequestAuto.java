package ru.ikon.DTO.CreateServiceEntry;

public class RequestAuto {
    private long consumerID;
    private String tyreSetID;
    private String entryType;
    private String status;
    private String billNumber;

    public RequestAuto() {
    }

    public RequestAuto(long consumerID, String tyreSetID, String entryType, String status, String billNumber) {
        this.consumerID = consumerID;
        this.tyreSetID = tyreSetID;
        this.entryType = entryType;
        this.status = status;
        this.billNumber = billNumber;
    }

    public long getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(long consumerID) {
        this.consumerID = consumerID;
    }

    public String getTyreSetID() {
        return tyreSetID;
    }

    public void setTyreSetID(String tyreSetID) {
        this.tyreSetID = tyreSetID;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    @Override
    public String toString() {
        return "RequestAuto{" +
                "consumerID=" + consumerID +
                ", tyreSetID='" + tyreSetID + '\'' +
                ", entryType='" + entryType + '\'' +
                ", status='" + status + '\'' +
                ", billNumber='" + billNumber + '\'' +
                '}';
    }
}
