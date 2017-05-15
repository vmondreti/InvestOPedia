package com.invest.model;

import java.util.Date;

public class PurchaseTracker {
    private long id;
    private String stockName;
    private double purchasePrice;
    private int quantity;
    private Date purchaseDate;
    private Date sellDate;

    public PurchaseTracker(long id, String stockName, double purchasePrice, int quantity, Date purchaseDate, Date sellDate) {
        this.id = id;
        this.stockName = stockName;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.sellDate = sellDate;
    }

    public long getId() {
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

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
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
