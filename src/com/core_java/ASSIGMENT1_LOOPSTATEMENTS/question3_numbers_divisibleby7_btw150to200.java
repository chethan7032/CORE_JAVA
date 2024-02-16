package com.core_java.ASSIGMENT1_LOOPSTATEMENTS;

public class question3_numbers_divisibleby7_btw150to200 {

    public  void whileloop()
    {
        int i=150;
        while (i<=200)
        {
            if(i%7==0)
            {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("using while loop completed");
    }

    public static void dowhileloop()
    {
        int i=150;
        while (i<=200)
        {
            if(i%7==0)
            {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("using while doloop completed");
    }



    public static void main(String[] args) {
        question3_numbers_divisibleby7_btw150to200 obj=new question3_numbers_divisibleby7_btw150to200();
        obj.whileloop();
        dowhileloop();

    }
}
