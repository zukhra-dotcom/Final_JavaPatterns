package com.company;

import com.company.people.Students;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to University Application!\n");
        System.out.println("Enter 1 to begin");
        System.out.println("Enter 2 to exit");
        int choice = in.nextInt();

        if(choice==1){
            System.out.println("Hello, let`s start with introduction!");
            University Students = new Students();
            Students.title();
            Students.TeachStudents();
            System.out.println("-------- STRATEGY PATTERN----------\n");

            System.out.println("Please, enter what info do you want to know: ");
            System.out.println("Home work system - 1\n" +
                    "Something else - 2\n");
            int homeworksSystem = in.nextInt();

            if(homeworksSystem == 1){
                System.out.println("The application via students do homeworks and Example: ");
                ControlSystem Moodle = new ControlSystem();
                Moodle.addTopic("Strategy Pattern");
                Moodle.addTopic("Observer Pattern");
                Moodle Discipline = new Moodle("Java Patterns");

                Moodle.NewTopic(Discipline);
                Moodle.addTopic("Decorator Pattern");
                Moodle.removeTopic("Strategy Pattern");
                Moodle.addTopic("Bridge Pattern");
                System.out.println("--------OBSERVER PATTERN----------");
            }

            if(homeworksSystem == 2){
                System.out.println("Something else");
            }

        }
        if(choice==2){
            System.out.println("Thank you for coming!");
            in.close();
        }

//
//        ControlSystem Moodle = new ControlSystem();
//        Moodle.addTopic("Strategy Pattern");
//        Moodle.addTopic("Observer Pattern");
//        Moodle Discipline = new Moodle("Java Patterns");
//
//        Moodle.NewTopic(Discipline);
//        Moodle.addTopic("Decorator Pattern");
//        Moodle.removeTopic("Strategy Pattern");
//        Moodle.addTopic("Bridge Pattern");
//
//        System.out.println("--------OBSERVER PATTERN----------");
    }
}
