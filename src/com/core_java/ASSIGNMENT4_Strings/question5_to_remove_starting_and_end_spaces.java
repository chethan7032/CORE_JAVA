package com.core_java.ASSIGNMENT4_Strings;

public class question5_to_remove_starting_and_end_spaces {
    public static void main(String[] args) {
        String s1="   hello world   ";
        System.out.println("before removing the spaces: "+s1);
        System.out.println("after removing the spaces: "+s1.trim());
    }
}
