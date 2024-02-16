package com.core_java.ASSIGNMENT4_Strings;

import java.sql.SQLOutput;

public class Practice_code_for_my_understanding {
    public static void string_creation_in_normal_way()
    {
        String s1="hello chethan";
        String s2="hello chethan";
        System.out.println(s1==s2);
        String s3="chethan";
        System.out.println(s1==s3);
        System.out.println(s1==s3);

        System.out.println("IN THESE METHODE ALL THE VARIABLES ARE STORED IN STRING CONSTAN POOL. \n" +
                "Once s1 is created and when we going to create s2, 1st its check the pool memomry if the content of the s1 and s2 are same\n" +
                "it assigns same address for s2 also rather then creating one more space. ");
    }

    public static void string_creation_in_object_way()
    {
        String s1=new String("chethan");
        String s2=new String("chethan");
        String s3=new String("chethan");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println("Here the story is little different it creats diffrent locatios for all the varibles");


    }

    public static void demo_of_2_methods()
    {
        String s1="chethan";
        String s2=new String("chethan");
        System.out.println(s1==s2);
        System.out.println("here obiosly the output will be false because s1 is in pool memory and \n" +
                "s2 is in heap memory.So the address of the 2 variables will different so it gives false");
    }



    public static void main(String[] args) {
        System.out.println("printing outputs of string_creation_in_normal_way method ");
        string_creation_in_normal_way();
        System.out.println("printing outputs of string_creation_in_object_way ");
        string_creation_in_object_way();
        System.out.println("demo of 2 ways ");
        demo_of_2_methods();

    }
}
