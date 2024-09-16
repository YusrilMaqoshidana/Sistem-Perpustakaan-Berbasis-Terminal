package com.fasilkom.student;

public class Student {
    private String name;
    private Long nim;
    private String faculty;

    public Student(String name, Long nim, String faculty) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
    }

    public String getName() {
        return this.name;
    }

    public Long getNim() {
        return this.nim;
    }

    public String getFaculty() {
        return this.faculty;
    }
}