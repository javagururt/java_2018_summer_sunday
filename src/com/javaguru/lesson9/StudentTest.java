package com.javaguru.lesson9;

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

        System.out.println("Student: ");
        student.learn();
        System.out.println();

        System.out.println("Junior: ");
        juniorDeveloper.learn();
        juniorDeveloper.writeCode();
        System.out.println();

        System.out.println("Middle dev.:");
        middleDeveloper.learn();
        middleDeveloper.writeCode();
        middleDeveloper.debugCode();
        System.out.println();

        System.out.println("Senior dev.: ");
        seniorDeveloper.learn();
        seniorDeveloper.writeCode();
        seniorDeveloper.debugCode();
        seniorDeveloper.solveProblems();
    }
}
