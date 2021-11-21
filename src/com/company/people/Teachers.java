package com.company.people;

import com.company.TeachesStudents;
import com.company.Teaching;
import com.company.University;

public class Teachers extends University {

    public Teachers() {
        super(new Teaching());
    }

    @Override
    public void title() {
        System.out.println("I am a teacher at University");
    }
}
