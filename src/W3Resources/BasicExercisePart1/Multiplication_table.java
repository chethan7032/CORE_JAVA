/* Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

 */

package W3Resources.BasicExercisePart1;
import java.util.*;
public class Multiplication_table {
    public static void main(String[] args) {
       int a;
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the number that you want to print table");
        a=sc.nextInt();
        System.out.printf("Multiplication table of is %d \n",a);
        for(int i=1;i<=10;i++)
        {
            int res=a*i;
            System.out.println(+a+"*"+i+"="+res);
        }
    }
}
