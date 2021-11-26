package com.company.Address;

public class Almaty extends Kazakhstan{

    public Almaty() {
        super("Delivery to the Almaty");
    }

    @Override
    public void useAddress() {
        System.out.println(city+" choosen");
        this.post.applyAddress();
    }
}
