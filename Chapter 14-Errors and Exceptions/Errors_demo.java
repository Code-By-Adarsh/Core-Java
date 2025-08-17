import java.util.Scanner;
public class Errors_demo {
    public static void main(String[] args) {
        //1) Syntax error demo:
        //int a = 5 -----> Throws syntax error.
        //int a = 5;
        //System.out.println(a);

        //2) Logical error demo:
        //to print all prime number between 1 and 10:
        /*
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);
        }
         */

        //3) Runtime error demo:
        System.out.println("Program of adding two given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("The addition of "+a+" and "+b+" is : "+c);
    }
}

