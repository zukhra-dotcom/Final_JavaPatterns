package com.company.Instruments;

public class InstrumentsFactory implements Instruments{ //Concrete Factory
    @Override
    public AddToCart getAddToCard() {
        return new Buy();
    }

    @Override
    public Like getLike() {
        return new SeeLater();
    }
}
