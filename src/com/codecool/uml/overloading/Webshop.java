package com.codecool.uml.overloading;

import java.util.Currency;
import java.util.Date;


public class Webshop {

    public static void main(String[] args) {
        FeaturedProductCategory laptops = new FeaturedProductCategory("laptop",
                "laptops",
                "This is a personal computer",
                new Date());


        Product productOne = new Product("apple", 500f, Currency.getInstance("HUF"), laptops);
        Product productTwo = new Product("sony", 200f, Currency.getInstance("HUF"), laptops);
        Product productThree = new Product("acer", 100f, Currency.getInstance("HUF"), laptops);

        System.out.println(productOne.getFeaturedProductCategory().getStartDate());
        System.out.println(productOne.getId());
        System.out.println(productOne.getName());
        System.out.println(productOne.getDefaultPrice());
        System.out.println(productOne.getFeaturedProductCategory().getName());
        System.out.println(productOne.getFeaturedProductCategory().getDepartment());
        System.out.println(productOne.getFeaturedProductCategory().getDescription());

        System.out.println(productTwo.getFeaturedProductCategory().getStartDate());
        System.out.println(productTwo.getId());
        System.out.println(productTwo.getName());
        System.out.println(productTwo.getDefaultPrice());
        System.out.println(productTwo.getFeaturedProductCategory().getName());
        System.out.println(productTwo.getFeaturedProductCategory().getDepartment());
        System.out.println(productTwo.getFeaturedProductCategory().getDescription());

        System.out.println(productThree.getFeaturedProductCategory().getStartDate());
        System.out.println(productThree.getId());
        System.out.println(productThree.getName());
        System.out.println(productThree.getDefaultPrice());
        System.out.println(productThree.getFeaturedProductCategory().getName());
        System.out.println(productThree.getFeaturedProductCategory().getDepartment());
        System.out.println(productThree.getFeaturedProductCategory().getDescription());

    }
}
