package com.invest.service;

import com.invest.model.PurchaseTracker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ashish on 5/14/2017.
 */
public class PurchaseTrackerServiceImplTest {

    private PurchaseTrackerServiceImpl purchaseTrackerService;

    @Before
    public void setUp() throws Exception {
        purchaseTrackerService = new PurchaseTrackerServiceImpl();
    }

    @Test
    public void testPurchaseListIsNotNull() throws Exception {
        // Act
        List<PurchaseTracker> purchaseList = purchaseTrackerService.getPurchaseList();

        // Assert
        Assert.assertNotNull(purchaseList);
    }

}