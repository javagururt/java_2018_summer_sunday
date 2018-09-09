package com.javaguru.lesson9;

import java.util.ArrayList;
import java.util.List;

class PolymorphismTest {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        List<Student> students = new ArrayList<>();
        students.add(seniorDeveloper);
        students.add(middleDeveloper);
        students.add(juniorDeveloper);
        students.add(firstStudent);

        for (Student student : students) {
            student.learn();
        }
    }
}
