package com.core_java.ASSIGNMENT4_Strings;

public class question3_occurance_of_character_in_string {
    public static void main(String[] args) {
        String s1="Hello World";
        char target='l';
        int count=0;
        char arr[]= s1.toCharArray();
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]);

        }

        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }

        }
        System.out.println(" character L "+count+ " times");

    }
}
