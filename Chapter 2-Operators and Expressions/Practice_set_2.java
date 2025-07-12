import java.util.Scanner;

public class Practice_set_2 {
    public static void main(String[] args) {
    //------->Increment and Decrement
        int y = 25;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);

        //------->Quick Quiz
        int x = 7;
        int a = ++x*8;
        System.out.println(a);
        int b = (x++)*8;
        System.out.println(b);
        int c = (x*5);
        System.out.println(c);

        //-------------->Practice Set<-----------//
        //1)
        float a1 = 7/4 * 9/2;
        System.out.println(a);

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
        System.out.println(b>c);

        //4)
        int d = (5 * 5 - 3 * 3) / (2 * 2 * 2);
        System.out.println(d);

        //5)
        int f = 7*49/7-35/7;
        System.out.println(f);




    }
}
