package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;


public class Webshop {

    public static void main(String[] args) {
        FeaturedProductCategory appleMacbook = new FeaturedProductCategory("Macbook", "Personal Computer", "This is a very good personal computer", new Date());
        FeaturedProductCategory sonyLaptop = new FeaturedProductCategory("Vaio", "Personal Computer", "Sony is also a very good PC", new Date());
        FeaturedProductCategory acerLaptop = new FeaturedProductCategory("K52F", "Personal Computer", "Acer is as good as Sony", new Date());

        FeaturedProductCategory appleSmartPhone = new FeaturedProductCategory("apple", "Smartphone","The best mobile phone ever.", new Date());
        FeaturedProductCategory samsungSmartPhone = new FeaturedProductCategory("samsung", "Smartphone","The second best mobile phone.", new Date());

        Supplier supplierWaberer = new Supplier("Waberer","Using Trucks");
        Supplier supplierDHL = new Supplier("DHL", "Using Planes");
        Supplier supplierFedex = new Supplier("FEDEX", "Using Planes and Trucks");

        Product productOne = new Product("apple", 500f, Currency.getInstance("HUF"), appleMacbook, supplierWaberer);
        Product productTwo = new Product("sony", 200f, Currency.getInstance("HUF"), sonyLaptop, supplierDHL);
        Product productThree = new Product("acer", 100f, Currency.getInstance("HUF"), acerLaptop, supplierWaberer);
        Product productFour= new Product("Iphone", 300f, Currency.getInstance("HUF"), appleSmartPhone, supplierDHL);
        Product productFive= new Product("Samsung Galaxy", 320f, Currency.getInstance("HUF"), samsungSmartPhone, supplierFedex);

        Product product = new Product();
        product.getProductsBy(product.getProductList(), "Personal Computer");

//        System.out.println(productOne.toString());
//        System.out.println(productOne.getFeaturedProductCategory().getStartDate());
//        System.out.println(productOne.getFeaturedProductCategory().getName());
//        System.out.println(productOne.getFeaturedProductCategory().getDepartment());
//        System.out.println(productOne.getFeaturedProductCategory().getDescription());
//        System.out.println(productOne.getSupplier().getName());
//        System.out.println(productOne.getSupplier().getDescription());
//        System.out.println();
//
//        System.out.println(productTwo.toString());
//        System.out.println(productTwo.getFeaturedProductCategory().getStartDate());
//        System.out.println(productTwo.getFeaturedProductCategory().getName());
//        System.out.println(productTwo.getFeaturedProductCategory().getDepartment());
//        System.out.println(productTwo.getFeaturedProductCategory().getDescription());
//        System.out.println(productTwo.getSupplier().getName());
//        System.out.println(productTwo.getSupplier().getDescription());
//        System.out.println();
//
//        System.out.println(productThree.toString());
//        System.out.println(productThree.getFeaturedProductCategory().getStartDate());
//        System.out.println(productThree.getFeaturedProductCategory().getName());
//        System.out.println(productThree.getFeaturedProductCategory().getDepartment());
//        System.out.println(productThree.getFeaturedProductCategory().getDescription());
//        System.out.println(productThree.getSupplier().getName());
//        System.out.println(productThree.getSupplier().getDescription());
//        System.out.println();
//
//        System.out.println(productFour.toString());
//        System.out.println(productFour.getFeaturedProductCategory().getStartDate());
//        System.out.println(productFour.getFeaturedProductCategory().getName());
//        System.out.println(productFour.getFeaturedProductCategory().getDepartment());
//        System.out.println(productFour.getFeaturedProductCategory().getDescription());
//        System.out.println(productFour.getSupplier().getName());
//        System.out.println(productFour.getSupplier().getDescription());
//        System.out.println();
//
//        System.out.println(productFive.toString());
//        System.out.println(productFive.getFeaturedProductCategory().getStartDate());
//        System.out.println(productFive.getFeaturedProductCategory().getName());
//        System.out.println(productFive.getFeaturedProductCategory().getDepartment());
//        System.out.println(productFive.getFeaturedProductCategory().getDescription());
//        System.out.println(productFive.getSupplier().getName());
//        System.out.println(productFive.getSupplier().getDescription());
    }
}
