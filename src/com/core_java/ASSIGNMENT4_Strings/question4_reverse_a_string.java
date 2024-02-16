package com.core_java.ASSIGNMENT4_Strings;
import java.util.*;

public class question4_reverse_a_string {
    public static void reversemethode(String str)
    {
       char arr[]=str.toCharArray();
       for(int i=arr.length-1;i>=0;i--)
       {
           System.out.print(arr[i] +" ");
       }


    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1;
        System.out.println("enter the string");
        s1=sc.nextLine();
        reversemethode(s1);






    }
}
