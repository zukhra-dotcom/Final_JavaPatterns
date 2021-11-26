package com.company;

public class WithoutCustomers implements WorkingWithCustomers{
    @Override
    public void customers() {
        System.out.println("I don`t work with customers");
    }
}
