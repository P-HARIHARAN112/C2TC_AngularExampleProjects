package com.mohankumar.assignment6;
import java.util.*;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test scores: ");
        int n = sc.nextInt();

        StudentScores student = new StudentScores(n);

        student.inputScores(sc);
        student.convertToArrayList();
        student.displayScores();

        sc.close();
    }
}