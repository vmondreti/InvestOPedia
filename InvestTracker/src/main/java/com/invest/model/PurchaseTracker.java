package com.invest.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseTracker {
    private int id;
    private String stockName;
    private BigDecimal purchasePrice;
    private int quantity;
    private Date purchaseDate;
    private Date sellDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getSellDate() {
        return sellDate;
    }

    public void setSellDate(Date sellDate) {
        this.sellDate = sellDate;
    }

    @Override
    public String toString() {
        return "PurchaseTracker{" +
                "id=" + id +
                ", stockName='" + stockName + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", quantity=" + quantity +
                ", purchaseDate=" + purchaseDate +
                ", sellDate=" + sellDate +
                '}';
    }
}
