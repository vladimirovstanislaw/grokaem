package ru.ikon.metaData;

import ru.ikon.entities.IntegrationPartner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestSetMetaData {
    private final AtomicInteger ai;
    private final List<RequestMetaData> list = new ArrayList<>();
    private IntegrationPartner partner;

    public RequestSetMetaData() {
        this.ai = new AtomicInteger(1);
    }

    public RequestSetMetaData(IntegrationPartner partner) {
        this.ai = new AtomicInteger(1);
        this.partner = partner;
    }

    public List<RequestMetaData> getList() {
        return list;
    }

    public IntegrationPartner getPartner() {
        return partner;
    }

    public void setPartner(IntegrationPartner partner) {
        this.partner = partner;
    }

    public boolean add(RequestMetaData requestMetaData, boolean updateSeqNumber) {
        if (updateSeqNumber == true) {
            requestMetaData.setSequenceNumber(ai.getAndIncrement());
        }
        return list.add(requestMetaData);
    }

}
