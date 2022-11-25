package com.zxx.excu;

import java.util.Date;

public class User {
    private String studentNum;
    private String name;
    private int score;
    private String classes;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "User{" +
                "studentNum='" + studentNum + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", classes='" + classes + '\'' +
                '}';
    }
}
