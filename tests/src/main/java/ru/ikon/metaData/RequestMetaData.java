package ru.ikon.metaData;

import ru.ikon.entities.IntegrationPartner;

public class RequestMetaData {


    //sequenceNumber of request in series
    private long sequenceNumber;
    private IntegrationPartner partner;
    private long startRequestLaunch;
    private long endRequestLaunch;

    private long latency;
    private String requestType;

    private int statusHTTPCode;

    public RequestMetaData() {
    }

    public RequestMetaData(long sequenceNumber, IntegrationPartner partner, long startRequestLaunch, long endRequestLaunch, long latency, String requestType, int statusHTTPCode) {
        this.sequenceNumber = sequenceNumber;
        this.partner = partner;
        this.startRequestLaunch = startRequestLaunch;
        this.endRequestLaunch = endRequestLaunch;
        this.latency = latency;
        this.requestType = requestType;
        this.statusHTTPCode = statusHTTPCode;
    }

    public long getStartRequestLaunch() {
        return startRequestLaunch;
    }

    public void setStartRequestLaunch(long startRequestLaunch) {
        this.startRequestLaunch = startRequestLaunch;
    }

    public IntegrationPartner getPartner() {
        return partner;
    }

    public void setPartner(IntegrationPartner partner) {
        this.partner = partner;
    }

    public void setLatency(long latency) {
        this.latency = latency;
    }

    public long getEndRequestLaunch() {
        return endRequestLaunch;
    }

    public void setEndRequestLaunch(long endRequestLaunch) {
        this.endRequestLaunch = endRequestLaunch;
        if (this.startRequestLaunch == 0) {
            throw new RuntimeException("Wasn't set startRequestLaunch.");
        }
        this.latency = this.endRequestLaunch - this.startRequestLaunch;
    }

    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public long getLatency() {
        return latency;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public int getStatusHTTPCode() {
        return statusHTTPCode;
    }

    public void setStatusHTTPCode(int statusHTTPCode) {
        this.statusHTTPCode = statusHTTPCode;
    }

    @Override
    public String toString() {
        return "RequestMetaData{" +
                "sequenceNumber=" + sequenceNumber +
                ", startRequestLaunch=" + startRequestLaunch +
                ", endRequestLaunch=" + endRequestLaunch +
                ", latency=" + latency +
                ", requestType='" + requestType + '\'' +
                ", statusHTTPCode=" + statusHTTPCode +
                '}';
    }
}
