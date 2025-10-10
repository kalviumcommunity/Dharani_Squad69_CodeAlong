package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n=== School Directory ===");
        for (Person person : people) {
            person.displayDetails(); // Polymorphic call
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the School Management System!");

        // Create Students
        Student s1 = new Student("Alice", "Grade 10");
        Student s2 = new Student("Bob", "Grade 11");
        Student s3 = new Student("Charlie", "Grade 12");

        // Create Teacher
        Teacher t1 = new Teacher("Mr. Sharma", "Mathematics");
        Teacher t2 = new Teacher("Ms. Gupta", "English");

        // Create Staff
        Staff staff1 = new Staff("Ravi", "Lab Assistant");
        Staff staff2 = new Staff("Meena", "Clerk");

        // Combine everyone into a school directory
        ArrayList<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(s1);
        schoolPeople.add(s2);
        schoolPeople.add(s3);
        schoolPeople.add(t1);
        schoolPeople.add(t2);
        schoolPeople.add(staff1);
        schoolPeople.add(staff2);

        // Display Directory (Polymorphism in action)
        displaySchoolDirectory(schoolPeople);

        // Create Courses
        ArrayList<Course> courses = new ArrayList<>();
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("English");
        Course c3 = new Course("Economics");

        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        // Attendance Records
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(s1, c1, "Present"));
        records.add(new AttendanceRecord(s2, c2, "Absent"));
        records.add(new AttendanceRecord(s3, c3, "Late")); // invalid

        // Display Attendance Records
        System.out.println("\n=== Attendance Log ===");
        for (AttendanceRecord record : records) {
            record.displayRecord();
        }

        // Save Data
        FileStorageService storage = new FileStorageService();

        // Filter only Students from schoolPeople
        List<Student> studentsOnly = new ArrayList<>();
        for (Person person : schoolPeople) {
            if (person instanceof Student) {
                studentsOnly.add((Student) person);
            }
        }

        storage.saveData(studentsOnly, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");

        System.out.println("\n✅ All data saved successfully!");
    }
}