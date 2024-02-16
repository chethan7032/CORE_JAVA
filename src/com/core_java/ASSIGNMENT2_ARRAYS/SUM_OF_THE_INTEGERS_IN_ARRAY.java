package com.core_java.ASSIGNMENT2_ARRAYS;



public class SUM_OF_THE_INTEGERS_IN_ARRAY {

public static int using_forloop(){
    int arr[]={2,5,1,9,6};
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    return sum;
     }

     public static void using_foreach_loop()
     {
         int arr[]={2,5,1,9,6};
         int sum=0;
         for (int value:arr) {
             sum+=value;

         }
         System.out.println("sum value using foreachloop is:"+sum);

     }

    public static void main(String[] args) {
        using_foreach_loop();
        int result=using_forloop();
        System.out.println("sum value using for loop is: "+result);
    }
}
