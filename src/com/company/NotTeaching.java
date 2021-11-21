package com.company;

import java.util.List;

public class NotTeaching implements TeachesStudents{
    @Override
    public void teaching() {
        System.out.println("I don`t teach students");
    }

    @Override
    public void update(List<String> topics) {
    }
}
