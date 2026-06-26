package Chapter2_OperatorsAndExpressions;

import java.util.Scanner;

public class Practice_set_2 {
    public static void main(String[] args) {
    //------->Increment and Decrement
        int y = 25;
        System.out.println(y++); //25
        System.out.println(y); //26
        System.out.println(++y); //27
        System.out.println(y); //27

        //------->Quick Quiz
        int x = 7;
        int a = ++x*8;
        System.out.println(a); //64
        int b = (x++)*8;
        System.out.println(b); //64
        int c = (x*5);
        System.out.println(c); //45

        //-------------->Practice Set<-----------//
        //1)
        float a1 = 7/4 * 9/2;
        System.out.println(a1); //4

        //2)
        //Incryption---------->
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);

        //Decryption-------->
        grade = (char)(grade-8);
        System.out.println(grade);

        grade += 8;
        System.out.println(grade);

        //3)
        float b1 = 7f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        float c1 = sc.nextFloat();
        System.out.println(b1>c1);

        //4)
        int d = (5 * 5 - 3 * 3) / (2 * 2 * 2);
        System.out.println(d);

        //5)
        int f = 7*49/7-35/7;
        System.out.println(f);




    }
}
