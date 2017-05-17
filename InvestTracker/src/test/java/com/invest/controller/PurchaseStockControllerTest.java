package com.invest.controller;

import com.invest.dao.PurchaseTrackerDAO;
import com.invest.model.PurchaseTracker;
import com.invest.service.IPurchaseTrackerService;
import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static com.invest.util.DateUtils.sysdate;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration
public class PurchaseStockControllerTest {

    @Rule
    public JUnitRuleMockery mockery = new JUnitRuleMockery();

    @Mock
    PurchaseTrackerDAO purchaseTrackerDao;

    @Mock
    IPurchaseTrackerService purchaseTrackerService;

    PurchaseStockController purchaseStockController;

    @Before
    public void setUp() throws Exception {
        purchaseStockController = new PurchaseStockController(purchaseTrackerService);
    }

    @Test
    public void getAllPurchases() throws Exception {

        PurchaseTracker purchaseTracker = new PurchaseTracker(1,"test",1.1,10, sysdate,null);

        List<PurchaseTracker> purchaseTrackers = new ArrayList<>();
        purchaseTrackers.add(purchaseTracker);

        mockery.checking(new Expectations(){
            {
                allowing(purchaseTrackerDao).populateDummyUsers();
                will(returnValue(purchaseTrackers));
                allowing(purchaseTrackerService).getPurchaseList();
                will(returnValue(purchaseTrackers));
            }
        });
        //act
        ResponseEntity<List<PurchaseTracker>> purchasesList = purchaseStockController.getAllPurchases();

        List<PurchaseTracker> trackerList = purchasesList.getBody();

        //assert
        assertNotNull(purchasesList);
        assertThat(trackerList.size(),is(1));
        assertThat(trackerList.get(0).getStockName(),is(purchaseTracker.getStockName()));
    }

}