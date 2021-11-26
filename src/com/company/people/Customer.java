package com.company.people;

import com.company.DeliveryCompany;
import com.company.WithCustomers;
import com.company.WorkingWithCustomers;

public class Customer extends DeliveryCompany {

    public Customer() {
        super(new WithCustomers());
    }

    @Override
    public void title() {
        System.out.println("I am a customer");
    }
}
