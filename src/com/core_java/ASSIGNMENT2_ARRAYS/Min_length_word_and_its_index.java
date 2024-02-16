package com.core_java.ASSIGNMENT2_ARRAYS;
import java.util.*;
public class Min_length_word_and_its_index {

    public static void main(String[] args) {

        String arr1[]={"coffee","water","chai","deit","coke"};
        int size= arr1.length;
        int arr2[]=new int[size];

        for (int i=0;i< arr1.length;i++) {
            String ele = arr1[i];
            int ele_size = ele.length();
            arr2[i] = ele_size;
            System.out.println(arr2[i]);
        }
        int min=arr2[0];
        for (int i=0;i< arr1.length;i++) {

            if (min >= arr2[i]) {
                min = arr2[i];
            }

        }
        for (int i=0;i< arr1.length;i++) {

            if (min==arr2[i]) {

            }

        }
    }
}
