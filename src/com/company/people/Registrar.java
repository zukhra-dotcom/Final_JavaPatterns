package com.company.people;

import com.company.DeliveryCompany;
import com.company.WithCustomers;
import com.company.WorkingWithCustomers;

public class Registrar extends DeliveryCompany {

    public Registrar() {
        super(new WithCustomers());
    }

    @Override
    public void title() {
        System.out.println("I am employee in company");
    }
}
