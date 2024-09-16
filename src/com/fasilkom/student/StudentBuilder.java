package com.fasilkom.student;

public class StudentBuilder {
    private String name;
    private Long nim;
    private String faculty;

    public StudentBuilder(){}
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setNim(Long nim) {
        this.nim = nim;
        return this;
    }

    public StudentBuilder setFaculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    public Student build() {
        return new Student(name, nim, faculty);
    }
}
