package com.core_java.ASSIGNMENT2_ARRAYS;

public class Max_number_and_its_index {
    public static void main(String[] args) {

        int arr[]={2,5,1,9,6};
        int max=arr[0];
        System.out.print("array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
            if(max<=arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("maximum number from array is :" +max);
        int index=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                 index=i;
            }

        }
        System.out.println("and maximum number index is : "+index);
    }
}
