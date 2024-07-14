/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.java.zrock;

import com.java.zrock.SquareRoot;
import com.java.zrock.StringToInt;
import com.java.zrock.FindLength;
import com.java.zrock.MergeHashMaps;
import com.java.zrock.GradeStudents;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ALICIA TAU
 */
public class MainClass {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //finding the square root of a number
        System.err.println("Question 1");
        SquareRoot sr = new SquareRoot();

        System.out.println("Provide a number: ");

        double num = sc.nextDouble();

        System.out.println("The square root is " + sr.squareRoot(num));
        System.out.println();
        System.out.println();

        //converting a string to a list of integers
        System.err.println("Question 2");
        StringToInt st = new StringToInt();
        sc.nextLine();
        System.out.println("Enter a string of numbers and separate them with a semi-colon: ");
        String data = sc.nextLine();
        List<Integer> list = st.stringToInt(data);
        System.out.println("List of integers: " + list);
        System.out.println();
        System.out.println();

        //finding the length of an array
        System.err.println("Question 3");
        FindLength fl = new FindLength();

        int[] arr = {1, 5, 3, 6, 7, 8, 2, 4, 9};
        System.out.println("The length of the array : " + fl.getLength(arr));
        System.out.println();
        System.out.println();

        //merging 2 HashMaps
        System.err.println("Question 4");
        MergeHashMaps mhm = new MergeHashMaps();
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> merged = mhm.mergeHashMaps(map1, map2);
        System.out.println("Merged HashMaps : " + merged);
        System.out.println();
        System.out.println();

        //grading a student based on a score
        System.err.println("Question 5");
        GradeStudents gs = new GradeStudents();

        System.out.println("Enter the student's score:");
        int score = sc.nextInt();

        String grade = gs.gradeStudent(score);
        System.out.println("The student's grade is: " + grade);
    }
}
