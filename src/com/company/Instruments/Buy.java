package com.company.Instruments;

public class Buy implements AddToCart{ //Concrete Product A
    @Override
    public void addingToCart() {
        System.out.println("This book added to cart. Start to buying.");
    }
}
