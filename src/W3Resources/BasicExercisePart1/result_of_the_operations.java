package W3Resources.BasicExercisePart1;

import java.util.Scanner;

/*  Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13    */


public class result_of_the_operations {

    public static double res;

    public static void optionA(int a, int b, int c) {
        res = a + (b * c);
        System.out.println("result is :" + res);
    }

    public static void optionB(int a, int b, int c) {
        res = (a + b) % c;
        System.out.println("result is :" + res);
    }

    public static double optionC(int a, int b, int c, int d) {
        res = a + (-b * c) / d;
        return res;
    }

    public void optionD(int a, int b, int c, int d, int e) {
        res = (a + b) / ((c * d) - e) % c;
        System.out.println("result is :" + res);
    }

    public static void main(String[] args) {
        result_of_the_operations obj = new result_of_the_operations();

        optionA(-5, 8, 6);
        optionB(55, 9, 9);
        optionC(20, -3, 5, 8);
        System.out.println("result is :" + res);
        obj.optionD(5, 15, 3, 2, -8);
    }
}
