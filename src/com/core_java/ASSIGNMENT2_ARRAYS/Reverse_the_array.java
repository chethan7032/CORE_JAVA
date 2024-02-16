package com.core_java.ASSIGNMENT2_ARRAYS;

public class Reverse_the_array {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1};
        System.out.println("array before reversing is :");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\narray after reversing :");
        for(int i= arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
