package com.school;

public class Main {
    public static void main(String[] args) {
        // Students
        Student[] students = {
            new Student("Amara"),
            new Student("Arnav"),
        };

        // Courses
        Course[] courses = {
            new Course("Botany"),
            new Course("Mathematics")
        };

        // Display Students
        System.out.println("=== Students ===");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display Courses
        System.out.println("=== Courses ===");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
