package com.core_java.ASSIGMENT1_LOOPSTATEMENTS;

public class QUESTION1_NUMBERS_FROM_1_TO_100 {

    public static void whileloop()
    {
        int i=0;

        while (i<=100)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("exited from while loop");
    }

    public void dowhileloop()

    {
        int i=0;
        do {
            System.out.print(i);
            i++;
        }while (i<=100);
        System.out.println("exited from do while loop");
    }

    public static void main(String[] args) {
        QUESTION1_NUMBERS_FROM_1_TO_100 obj=new QUESTION1_NUMBERS_FROM_1_TO_100();
        whileloop();
        obj.dowhileloop();

    }
}
