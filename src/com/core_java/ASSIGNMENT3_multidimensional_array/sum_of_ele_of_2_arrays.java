package com.core_java.ASSIGNMENT3_multidimensional_array;
import java.util.*;

public class sum_of_ele_of_2_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number rows and columns of 1st array");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("enter number rows and columns of 2st array");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        int arr2[][]=new int[r2][c2];
        int res[][]=new int[r1][c1];
        System.out.println("ENTER THE ELEMENTS OF 1ST ARRAY");
        for (int i=0;i< arr1.length;i++)
        {
            for ( int j=0;j< arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER THE ELEMENTS OF 2ST ARRAY");

        for (int i=0;i< arr2.length;i++)
        {
            for ( int j=0;j< arr2[i].length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        System.out.println("result array is : ");
        for(int i=0;i< res.length;i++)
        {
            for (int j=0;j<res[i].length;j++)
            {
                res[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();

        }



    }
}
