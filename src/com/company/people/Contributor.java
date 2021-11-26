package com.company.people;

import com.company.DeliveryCompany;
import com.company.WithoutCustomers;

public class Contributor extends DeliveryCompany {

    public Contributor() {
        super(new WithoutCustomers());
    }

    @Override
    public void title() {
        System.out.println("I am contributor in company");
    }
}
