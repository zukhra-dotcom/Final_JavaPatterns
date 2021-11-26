package com.company;

public class WithCustomers implements WorkingWithCustomers{
    @Override
    public void customers() {
        System.out.println("I work with customers");
    }
}
