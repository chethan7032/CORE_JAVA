package com.core_java.ASSIGNMENT2_ARRAYS;

public class MERGE_TWO_ARRAYS {
    public static void main(String[] args) {
        String arr1[]={"chai","coffee"};
        String arr2[]={"milk","water","coke"};
        int size1,size2,size3;
        size1=arr1.length;
        size2= arr2.length;
        size3=size1+size2;
        String arr3[]=new String[size3];
        for(int i=0;i<size1;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int i=size1;i<size3;i++)
        {
            arr3[i]=arr2[i-size1];
        }
        for(int i=0;i<size3;i++)
        {
            System.out.print(arr3[i]+ " ");
        }


    }
}
