package com.core_java.ASSIGNMENT3_multidimensional_array;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
public class sum_of_arr_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns in array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter array elements");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ARRAY IS :\n");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                sum+=arr[i][j];
            }

        }
        System.out.println("SUM OF ALL ELEMENTS IN ARRAY IS :"+sum);


    }
}
