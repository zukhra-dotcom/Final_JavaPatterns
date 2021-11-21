package com.company.people;

import com.company.NotTeaching;
import com.company.Teaching;
import com.company.University;

public class Students extends University {
    public Students(){
        super(new NotTeaching());
    }

    @Override
    public void title() {
        System.out.println("I am a student at University");
    }
}
