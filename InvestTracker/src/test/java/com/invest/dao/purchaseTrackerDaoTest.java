package com.invest.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ashish on 5/9/2017.
 */
public class purchaseTrackerDaoTest {

    private PurchaseTrackerDao purchaseTrackerDao;

    @Before
    public void setUp() throws Exception {
        purchaseTrackerDao = new PurchaseTrackerDao();
    }

    @Test
    public void getPurchaseList() throws Exception {

        //Act
        List<ArrayList> purchaseList = purchaseTrackerDao.getPurchaseList();

        assertNull(purchaseList);
    }

}