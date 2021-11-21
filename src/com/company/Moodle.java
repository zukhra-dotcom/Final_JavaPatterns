package com.company;

import java.util.List;

public class Moodle implements TeachesStudents{
    private String moodle;

    public Moodle(String moodle){
        this.moodle = moodle;
    }

    @Override
    public void teaching() {
    }

    @Override
    public void update(List<String> topics) {
        System.out.println("Moodle: " + moodle + "\nTopics: \n" + topics +"\n");
    }
}
