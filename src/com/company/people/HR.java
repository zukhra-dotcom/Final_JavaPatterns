package com.company.people;

import com.company.DeliveryCompany;
import com.company.WithoutCustomers;
import com.company.WorkingWithCustomers;

public class HR extends DeliveryCompany {

    public HR() {
        super(new WithoutCustomers());
    }

    @Override
    public void title() {
        System.out.println("I am a HR manager");
    }
}
