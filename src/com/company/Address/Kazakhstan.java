package com.company.Address;

public abstract class Kazakhstan {
    protected String city;
    protected Address post;

    public Kazakhstan(String city){
        this.city= city;
    }

    public abstract void useAddress();

    public void setAddress(Address post){
        this.post =post;
    }
}
