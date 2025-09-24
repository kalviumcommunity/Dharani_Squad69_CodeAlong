package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        Student[] students = {
            new Student("Amara"),
            new Student("Arnav"),
            new Student("Vidhan")
        };

        // Courses
        Course[] courses = {
            new Course("Botany"),
            new Course("Mathematics"),
            new Course("History")
        };

        // Display Students
        System.out.println("=== Students ===");
        for (Student s : students) s.displayDetails();

        // Display Courses
        System.out.println("=== Courses ===");
        for (Course c : courses) c.displayDetails();

        // Attendance Records
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(students[2].getStudentId(), courses[2].getCourseId(), "Late")); // invalid

        System.out.println("=== Attendance Records ===");
        for (AttendanceRecord record : attendanceLog) record.displayRecord();
    }
}
