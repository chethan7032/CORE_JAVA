package com.core_java.ASSIGMENT1_LOOPSTATEMENTS;

public class QUESTION2_EVEN_NUMBERS_BTW200_TO_500 {

    public static void whileloop()
    {
        int i=200;
        while (i<=500)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("using while lopp");
    }
    public  void dowhileloop()
    {
        int i=200;
        do {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }while (i<=500);
        System.out.println("using do while loop");
    }




    public static void main(String[] args) {
        whileloop();
        QUESTION2_EVEN_NUMBERS_BTW200_TO_500 obj=new QUESTION2_EVEN_NUMBERS_BTW200_TO_500();
        obj.dowhileloop();

    }
}
