package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Product {

    @Id
    private int productID;

    private String productName;

    private int productPrice;

    private int productCount;

    @Temporal(TemporalType.DATE)
    private Date updateDate;

    public Product() {

    }

    public Product(int productID, String productName, int productPrice, int productCount, Date updateDate) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
        this.updateDate = updateDate;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productCount=" + productCount +
                ", updateDate=" + updateDate +
                '}';
    }
}
