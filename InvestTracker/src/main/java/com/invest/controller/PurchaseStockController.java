package com.invest.controller;

import com.invest.service.IPurchaseTrackerService;
import com.invest.model.PurchaseTracker;
import com.invest.service.PurchaseTrackerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseStockController {

    public static final Logger logger = LoggerFactory.getLogger(PurchaseStockController.class);

    @Autowired
    IPurchaseTrackerService purchaseTrackerService;

    @Autowired
    public PurchaseStockController(IPurchaseTrackerService purchaseTrackerService) {
        this.purchaseTrackerService = purchaseTrackerService;
    }

    @RequestMapping(value = "/getAllPurchases", method = RequestMethod.GET)
    public ResponseEntity<List<PurchaseTracker>> getAllPurchases() {
        List<PurchaseTracker> purchaseList = purchaseTrackerService.getPurchaseList();
        if (purchaseList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(purchaseList, HttpStatus.OK);
    }
}
