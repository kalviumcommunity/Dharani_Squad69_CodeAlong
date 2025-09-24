package com.school;

public class Main {
    public static void main(String[] args) {
        // Array of Students
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails(1, "Alice");
        students[1] = new Student();
        students[1].setDetails(2, "Bob");

        // Array of Courses
        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setDetails(101, "Mathematics");
        courses[1] = new Course();
        courses[1].setDetails(102, "Science");

        // Display details
        System.out.println("=== Students ===");
        for (Student s : students) {
            s.displayDetails();
        }

        System.out.println("=== Courses ===");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
