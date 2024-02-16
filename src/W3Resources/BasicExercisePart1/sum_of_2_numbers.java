package W3Resources.BasicExercisePart1;
import java.util.*;
public class sum_of_2_numbers {
    public static int a,b;
    public static void main(String[] args) {
        double res;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of A and B");
        a=sc.nextInt();
        b=sc.nextInt();
        res=a+b;
        System.out.println("sum of A and B is :"+res);
    }
}
