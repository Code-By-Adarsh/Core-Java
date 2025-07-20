import java.util.Scanner;
//Practice_set_7
public class Practice_set_7 {
    /*  1)
    static void table(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
     */

    /*  2)
    static void pat(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     */

    /*  3)
    static int sum(int n){
        if(n == 1){
            return 1;
        }else {
            return n + sum(n-1);
        }

        int result = 0;
        for (int i = 1; i<=n; i++){
            result += i;
        }
        return result;
    }
     */

    /*  4)
    static void pat2(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
     */
     //  5)
    /*
    static int fibonacci(int n){
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
     */

    //  6)
    /*
    static int avg(int ... arr){
        int sum = 0;
        for (int a:arr){
            sum = sum + a;
        }
        return sum/arr.length;
    }
     */

    //  7)
    /*
    static void pat3(int n){
        if (n>0){
            pat3(n-1);
            for(int i=1; i<=n; i++){
                System.out.print("7");
            }
            System.out.println();
        }
    }
     */

    //  9)
    /*
    static double ans(double n){
        return n*(1.8d)+32;
    }
     */

    public static void main(String[] args) {
        /*  1)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want Multiplication table: ");
        int x = sc.nextInt();
        System.out.printf("The Multiplication table of %d will be: ",x);
        System.out.println(" ");
        table(x);
         */

        //  2)
        //pat(5);

        //  3)
        //System.out.println("The sum of first 5 natural number is : "+sum(5));

        //  4)
        //pat2(5);

        //  5)
        /*
        System.out.print("The fibonacci series upto 5 terms is: ");
        for (int i=0; i<5; i++){
            System.out.print(fibonacci(i)+" ");
        }
         */

        //  6)
        /*
        int [] marks = {34,45,56,28,59};
        int b = avg(marks);
        System.out.println(b);
         */

        //  7)
        //pat3(7);

        //  8)
        //Same as problem 7 repeat 2 using recursion.

        //  9)
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double x = sc.nextDouble();
        System.out.printf("The %.2f celsius in fahrenheit will be: %.2f",x,ans(x));
         */


        //  10)
        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(3);
            }
            System.out.println();
        }

        for(int x=10; x>=1; x--){
            for(int y=1; y<=x; y++){
                System.out.print(5);
            }
            System.out.println();
        }

    }
}

