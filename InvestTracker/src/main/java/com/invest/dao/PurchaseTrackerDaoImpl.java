package com.invest.dao;

import com.invest.model.PurchaseTracker;
import com.invest.service.PurchaseTrackerServiceImpl;
import com.invest.util.DateUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class PurchaseTrackerDaoImpl {

    private static final AtomicLong counter = new AtomicLong();

    public List<PurchaseTracker> populateDummyUsers() {
        List<PurchaseTracker> users = new ArrayList<PurchaseTracker>();
        users.add(new PurchaseTracker(counter.incrementAndGet(), "TSLA", 190.10, 2, DateUtils.sysdate, null));
        users.add(new PurchaseTracker(counter.incrementAndGet(), "SNAP", 21.2, 10, DateUtils.sysdate, null));
        users.add(new PurchaseTracker(counter.incrementAndGet(), "AMD", 11.21, 15, DateUtils.sysdate, null));
        users.add(new PurchaseTracker(counter.incrementAndGet(), "F", 10.3, 40, DateUtils.sysdate, null));
        return users;
    }
}