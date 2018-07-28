package com.codecool.uml.overloading;

public class Webshop {

    public static void main(String[] args) {

        Product productOne = new Product();
        ProductCategory productCategoryOne = new ProductCategory();
        Product productTwo = new Product();
        Product productThree = new Product();

        System.out.println("P1");
        System.out.println(productOne.getId());
        System.out.println("PC1");
        System.out.println(productTwo.getId());
        System.out.println(productThree.getId());

    }
}
