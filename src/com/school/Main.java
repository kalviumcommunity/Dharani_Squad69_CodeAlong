package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Amara", "12th Grade"));
        students.add(new Student("Arnav", "12th Grade"));

        // Courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics"));
        courses.add(new Course("Botany"));

        // Attendance Records
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        records.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Absent"));
        records.add(new AttendanceRecord(students.get(0).getId(), courses.get(1).getCourseId(), "Late")); // invalid

        // Save data to files
        FileStorageService storageService = new FileStorageService();
        storageService.saveData(students, "students.txt");
        storageService.saveData(courses, "courses.txt");
        storageService.saveData(records, "attendance_log.txt");
    }
}
