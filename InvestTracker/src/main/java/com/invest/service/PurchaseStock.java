package com.invest.service;

import com.invest.model.PurchaseTracker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Ashish on 5/10/2017.
 */
public class PurchaseStock {

    @RequestMapping("/makePurchase")
    public void greeting(@RequestParam(value="name", defaultValue="World") String name) {

    }
}
