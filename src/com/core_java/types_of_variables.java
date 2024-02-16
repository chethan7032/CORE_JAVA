package com.core_java;
import java.util.*;
public class types_of_variables {
    Scanner sc=new Scanner(System.in);
    static int num;
    public  int  variable_names()
    {
        System.out.println("enter the type of variable info you want to know");
        System.out.println("1 ---> INSTANCE VARIABLE" +
                "2---> CLASS VARIABLE" +
                "3---> LOCAL VARIABLE" +
                "4 ---> PARAMETERS");
         num=sc.nextInt();
        return num;
    }

    public static void main(String[] args) {
        types_of_variables ob=new types_of_variables();
        ob.variable_names();
        switch(num)
        {
            case 1:
                System.out.println("INFO ABOUT INSTANCE VARIABLE");
                break;

            case 2:
                System.out.println("info about CLASS VARIABLE");
                break;

            case 3:
                System.out.println("info about local variables");
                break;
            case 4:
                System.out.println("info about parameters");
        }
    }
}
