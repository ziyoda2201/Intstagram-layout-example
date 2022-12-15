package com.example.ziyoda_learing_android.shopping;

public class ShopModel {
    String productName;
    int productNumber;
    String productSize;
    float productPrice;
    String productColor;
    int productTypeId;

    public ShopModel(String productName, int productNumber, String productSize, float productPrice, String productColor, int productTypeId) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.productColor = productColor;
        this.productTypeId = productTypeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }
}
