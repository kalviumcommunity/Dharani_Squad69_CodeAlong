package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        Student student1 = new Student("Amara", "12th Grade");
        Student student2 = new Student("Arnav", "12th Grade");

        // Teachers
        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", "Science");

        // Staff
        Staff staff1 = new Staff("Mr. Lee", "Librarian");

        // Display
        System.out.println("=== Persons ===");
        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        teacher2.displayDetails();
        staff1.displayDetails();

        // Example AttendanceRecord usage with new student IDs
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(student1.getId(), 101, "Present"));
        attendanceLog.add(new AttendanceRecord(student2.getId(), 102, "Absent"));

        System.out.println("=== Attendance Records ===");
        for (AttendanceRecord record : attendanceLog) record.displayRecord();
    }
}
