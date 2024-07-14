/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.zrock;

/**
 *
 * @author ALICIA TAU
 */
public class GradeStudents {

    //grading students based on a score
    public String gradeStudent(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        return grade;
    }
}
