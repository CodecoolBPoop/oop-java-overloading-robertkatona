package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;


public class Webshop {

    public static void main(String[] args) {
        FeaturedProductCategory laptop = new FeaturedProductCategory(
                "NoteBook",
                "Personal Computer",
                "This is a very good personal computer",
                 new Date());

        FeaturedProductCategory mobile = new FeaturedProductCategory("apple", "Smartphone","The best mobile phone ever", new Date());

        Supplier supplierWaberer = new Supplier("Waberer","Using Trucks");
        Supplier supplierDHL = new Supplier("DHL", "Using Planes");

        Product productOne = new Product("apple", 500f, Currency.getInstance("HUF"), laptop, supplierWaberer);
        Product productTwo = new Product("sony", 200f, Currency.getInstance("HUF"), laptop, supplierDHL);
        Product productThree = new Product("acer", 100f, Currency.getInstance("HUF"), laptop, supplierWaberer);

        System.out.println(productOne.toString());
        System.out.println(productOne.getFeaturedProductCategory().getStartDate());
        System.out.println(productOne.getFeaturedProductCategory().getName());
        System.out.println(productOne.getFeaturedProductCategory().getDepartment());
        System.out.println(productOne.getFeaturedProductCategory().getDescription());
        System.out.println();

        System.out.println(productTwo.toString());
        System.out.println(productTwo.getFeaturedProductCategory().getStartDate());
        System.out.println(productTwo.getFeaturedProductCategory().getName());
        System.out.println(productTwo.getFeaturedProductCategory().getDepartment());
        System.out.println(productTwo.getFeaturedProductCategory().getDescription());
        System.out.println();

        System.out.println(productThree.toString());
        System.out.println(productThree.getFeaturedProductCategory().getStartDate());
        System.out.println(productThree.getFeaturedProductCategory().getName());
        System.out.println(productThree.getFeaturedProductCategory().getDepartment());
        System.out.println(productThree.getFeaturedProductCategory().getDescription());

    }
}
