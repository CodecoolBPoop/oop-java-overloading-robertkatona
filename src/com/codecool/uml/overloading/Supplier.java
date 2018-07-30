package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private static int id;
    private String name;
    private String description;

    public Supplier(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
