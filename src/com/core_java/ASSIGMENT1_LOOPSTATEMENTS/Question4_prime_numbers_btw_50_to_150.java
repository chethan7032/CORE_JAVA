package com.core_java.ASSIGMENT1_LOOPSTATEMENTS;

public class Question4_prime_numbers_btw_50_to_150 {

    public static void whileloop()
    {
        int i=50;
        int count=0;
        while (i<=150)
        {
            for(int j=1;j<=150;j++)
            {
                if(i%j==0)
                {
                   count= count++;
                    if(count>2)
                    {

                    }
                    else {
                        System.out.println(i);
                    }
                }
                if(count<=2)
                {
                    System.out.println(i);
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        whileloop();
    }
}
