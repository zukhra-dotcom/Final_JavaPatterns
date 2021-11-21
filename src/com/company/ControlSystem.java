package com.company;

import java.util.ArrayList;
import java.util.List;

public class ControlSystem implements Notifications{

    private List<String> topics = new ArrayList<>();
    private List<TeachesStudents> students = new ArrayList<>();

    public void addTopic(String topic){
        this.topics.add(topic);
        notifyAllStudents();
    }

    public void removeTopic(String topic){
        this.topics.remove(topic);
        notifyAllStudents();
    }
    @Override
    public void NewTopic(TeachesStudents topicName) {
        this.students.add(topicName);
    }

    @Override
    public void notifyAllStudents() {
        for (TeachesStudents topicName: students){
            topicName.update(this.topics);
        }
    }
}
