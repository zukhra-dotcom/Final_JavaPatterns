package com.company;

import java.util.List;

public class Teaching implements TeachesStudents{
    @Override
    public void teaching() {
        System.out.println("I teach students");
    }

    @Override
    public void update(List<String> topics) {
    }
}
