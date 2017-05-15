package com.invest.service;

import com.invest.model.PurchaseTracker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static com.invest.util.DateUtils.sysdate;

@Service("PurchaseTrackerService ")
public class PurchaseTrackerServiceImpl implements IPurchaseTrackerService {

    private static final AtomicLong counter = new AtomicLong();

    @Override
    public List<PurchaseTracker> getPurchaseList() {
        return populateDummyUsers();
    }

    private static List<PurchaseTracker> populateDummyUsers(){
        List<PurchaseTracker> users = new ArrayList<>();
        users.add(new PurchaseTracker(counter.incrementAndGet(),"TSLA",190.10,2, sysdate, null));
        users.add(new PurchaseTracker(counter.incrementAndGet(),"SNAP",21.2,10, sysdate, null));
        users.add(new PurchaseTracker(counter.incrementAndGet(),"AMD",11.21,15, sysdate, null));
        users.add(new PurchaseTracker(counter.incrementAndGet(),"F",10.3,40, sysdate, null));
        return users;
    }
}
