package com.thoughtworks.capability.gtb.entrancequiz.domain;

public class Student {
    private String studentName;

    public Student(String name) {
        this.studentName = name;
    }

    public String getName() {
        return studentName;
    }

    public void settName(String studentName) {
        this.studentName = studentName;
    }
}
