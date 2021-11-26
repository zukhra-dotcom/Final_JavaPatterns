package com.company.Address;

public class Chimkent extends Kazakhstan{

    public Chimkent() {
        super("Delivery to the Nursultan");
    }

    @Override
    public void useAddress() {
        System.out.println(city+" choosen");
        this.post.applyAddress();
    }
}