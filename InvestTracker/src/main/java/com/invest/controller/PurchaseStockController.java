package com.invest.controller;

import com.invest.configuration.MongoConfiguration;
import com.invest.service.IPurchaseTrackerService;
import com.invest.model.PurchaseTracker;
import com.invest.service.PurchaseTrackerServiceImpl;
import com.invest.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
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

    @RequestMapping(value = "/savePurchase", method = RequestMethod.GET)
    public void savePurchase() {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(MongoConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        PurchaseTracker purchaseTracker = new PurchaseTracker(1, "TSLA", 190.10, 2, DateUtils.sysdate, null);

        // save
        mongoOperation.save(purchaseTracker);

        // now user object got the created id.
        System.out.println("1. user : " + purchaseTracker);
    }


}
