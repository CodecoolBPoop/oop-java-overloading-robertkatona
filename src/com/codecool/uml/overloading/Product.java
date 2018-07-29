package com.codecool.uml.overloading;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Arrays;

public class Product {

    private static int counter = 0;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private FeaturedProductCategory featuredProductCategory;

    private Supplier supplier;
    private static List<Product> productList = new ArrayList<Product>();

    public Product(String name, float defaultPrice, Currency defaultCurrency, FeaturedProductCategory featuredProductCategory) {
        this.id = counter++;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
        this.featuredProductCategory = featuredProductCategory;
        productList.add(this);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public FeaturedProductCategory getFeaturedProductCategory() {
        return featuredProductCategory;
    }

    public void setFeaturedProductCategory(FeaturedProductCategory featuredProductCategory) {
        this.featuredProductCategory = featuredProductCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() { return super.toString(); }
}

