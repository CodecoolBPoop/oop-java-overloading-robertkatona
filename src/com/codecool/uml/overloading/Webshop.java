package com.codecool.uml.overloading;

import java.util.Currency;


public class Webshop {

    public static void main(String[] args) {
        Product productOne = new Product("apple", 200f, Currency.getInstance("HUF"));
        System.out.println(productOne.getId());
        System.out.println(productOne.getName());
        System.out.println(productOne.getDefaultPrice());
        System.out.println(productOne.getDefaultCurrency());

    }
}
