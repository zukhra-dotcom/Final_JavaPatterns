package com.company.Instruments;

public class SeeLater implements Like{ //Concrete Product B
    @Override
    public void like() {
        System.out.println("This book is liked. See book later.");
    }
}
