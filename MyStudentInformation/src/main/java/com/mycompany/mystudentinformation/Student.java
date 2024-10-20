/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mystudentinformation;

public class Student extends Person {
    private String studentID;
    private double gpa;
    private String course;

    public Student(String name, int age, String address, String studentID, double gpa, String course) {
        super(name, age, address);
        this.studentID = studentID;
        this.gpa = gpa;
        this.course = course;
    }

    // Getters and Setters
    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }
    public double getGPA() { return gpa; }
    public void setGPA(double gpa) { this.gpa = gpa; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nStudent ID: " + studentID + "\nGPA: " + gpa + "\nCourse: " + course;
    }
}
