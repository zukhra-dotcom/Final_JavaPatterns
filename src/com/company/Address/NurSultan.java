package com.company.Address;

public class NurSultan extends Kazakhstan{

    public NurSultan() {
        super("Delivery to the Nur-Sulyan");
    }

    @Override
    public void useAddress() {
        System.out.println(city+" choosen");
        this.post.applyAddress();
    }
}