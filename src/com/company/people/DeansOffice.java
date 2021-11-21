package com.company.people;

import com.company.NotTeaching;
import com.company.University;

public class DeansOffice extends University {
    public DeansOffice() {
        super(new NotTeaching());
    }

    @Override
    public void title() {
        System.out.println("I am a dean at University");
    }
}
