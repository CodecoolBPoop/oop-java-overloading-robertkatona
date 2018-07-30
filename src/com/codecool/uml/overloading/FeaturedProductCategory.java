package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {

    private Date startDate;
    private Date endDate;


    public FeaturedProductCategory(String name, String department, String description, Date startDate) {
        super(name, department, description);
        this.startDate = startDate;
    }



    public Date getStartDate() {
        return startDate;
    }
}
