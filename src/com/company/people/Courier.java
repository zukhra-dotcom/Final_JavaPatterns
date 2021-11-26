package com.company.people;

import com.company.DeliveryCompany;
import com.company.WithCustomers;
import com.company.WorkingWithCustomers;

public class Courier extends DeliveryCompany {

    public Courier() {
        super(new WithCustomers());
    }

    @Override
    public void title() {
        System.out.println("I am courier. I deliver books to customers");
    }
}
