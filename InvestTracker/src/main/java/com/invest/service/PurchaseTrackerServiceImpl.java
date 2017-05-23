package com.invest.service;

import com.invest.dao.PurchaseTrackerDAO;
import com.invest.model.PurchaseTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("purchaseTrackerService")
public class PurchaseTrackerServiceImpl implements IPurchaseTrackerService {

    PurchaseTrackerDAO purchaseTrackerDao;

    @Autowired
    public PurchaseTrackerServiceImpl(PurchaseTrackerDAO purchaseTrackerDao) {
        this.purchaseTrackerDao = purchaseTrackerDao;
    }

    @Override
    public List<PurchaseTracker> getPurchaseList() {
        return purchaseTrackerDao.populateDummyPurchases();
    }

}
