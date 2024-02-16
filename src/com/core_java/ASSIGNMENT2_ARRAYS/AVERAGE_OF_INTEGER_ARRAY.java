package com.core_java.ASSIGNMENT2_ARRAYS;
import java.util.*;
public class AVERAGE_OF_INTEGER_ARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("enter the array elements");
        int i;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("ARRAY ELEMENTS ARE :");
        int avg=0,sum=0;
        for(i=0;i<size;i++)
        {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        avg=sum/size;
        System.out.println("average is :"+avg);


    }
}
