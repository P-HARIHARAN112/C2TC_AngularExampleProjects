package com.mohankumar.assignment6;

import java.util.*;
class StudentScores {
 private int[] scores;                  
 private ArrayList<Integer> scoreList; 
 public StudentScores(int n) {
     scores = new int[n];
     scoreList = new ArrayList<>();
 }
 public void inputScores(Scanner sc) {
     System.out.println("Enter the test scores:");
     for (int i = 0; i < scores.length; i++) {
         scores[i] = sc.nextInt();
     }
 }

 public void convertToArrayList() {
     for (int score : scores) {
         scoreList.add(score);
     }
 }

 public void displayScores() {
     System.out.println("Elements in the ArrayList:");
     for (int score : scoreList) {
         System.out.println(score);
     }
 }
}
