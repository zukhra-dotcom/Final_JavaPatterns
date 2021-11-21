package com.company;

public abstract class University {
    public abstract void title();

    private TeachesStudents teachesStudents;

    public University(TeachesStudents teachesStudents) {
        this.teachesStudents = teachesStudents;
    }

    public void TeachStudents(){
        this.teachesStudents.teaching();
    }

    public TeachesStudents getTeachesStudents() {
        return teachesStudents;
    }

    public void setTeachesStudents(TeachesStudents teachesStudents){
        this.teachesStudents = teachesStudents;
    }

}
