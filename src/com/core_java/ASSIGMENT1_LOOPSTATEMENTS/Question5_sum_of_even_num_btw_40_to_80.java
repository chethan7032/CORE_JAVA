package com.core_java.ASSIGMENT1_LOOPSTATEMENTS;

public class Question5_sum_of_even_num_btw_40_to_80 {


    public static void whileloop()
    {
        int i=40,sum=0;
        System.out.println("even numbers between 40 to 80 are\n");
        while(i<=80)
        {
            if(i%2==0)
            {

                sum+=i;
            }
            i++;
        }
        System.out.println("sum using while loop is "+sum);
    }


    public void dowhile()
    {
        int i=40,sum=0;
        do {
            if(i%2==0)
            {
               sum+=i;
            }
            i++;
        }while (i<=80);
        System.out.println("sum using dowhile  is " +sum);
    }

    public static void forloop()
    {
        int i=40,sum=0;
        for(i=40;i<=80;i++)
        {
            if(i%2==0)
            {
                sum+=i;

            }
        }
        System.out.println("sum using for loop is "+sum);
    }

    public static void main(String[] args) {
        whileloop();
        Question5_sum_of_even_num_btw_40_to_80 obj=new Question5_sum_of_even_num_btw_40_to_80();
        obj.dowhile();
        forloop();

    }
}
