package com.company.Address;

public class Kazpost implements Address{
    @Override
    public void applyAddress() {
        System.out.println("Delivery to the Kazpost");
    }
}