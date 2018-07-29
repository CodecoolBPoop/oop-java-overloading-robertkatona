package com.codecool.uml.overloading;

import java.util.Currency;


public class Webshop {

    public static void main(String[] args) {
        ProductCategory laptops = new ProductCategory("laptop", "laptops", "personal cumputer");
        Product productOne = new Product("apple", 500f, Currency.getInstance("HUF"), laptops);
        Product productTwo = new Product("sony", 200f, Currency.getInstance("HUF"), laptops);
        Product productThree = new Product("acer", 100f, Currency.getInstance("HUF"),laptops);

        System.out.println(productOne.getProductList().size());
        System.out.println(productTwo.getProductList().size());
        System.out.println(productThree.getProductList().size());
    }
}
