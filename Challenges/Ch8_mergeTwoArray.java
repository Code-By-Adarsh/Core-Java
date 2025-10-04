package com.company;

import java.util.Arrays;

public class Ch8_mergeTwoArray {
    public static void main(String[] args) {
        int [] marks1 = {23,56,78,90,43};
        int [] marks2 = {14,63,25,68,98};
        int [] merged_marks = new int[marks1.length+marks2.length];
        for (int i=0; i<marks1.length; i++){
            merged_marks[i] = marks1[i];
        }
        for (int i=0; i<marks2.length; i++){
            merged_marks[marks1.length+i] = marks2[i];
        }
        System.out.println("Merged Array of marks: "+ Arrays.toString(merged_marks));
    }
}