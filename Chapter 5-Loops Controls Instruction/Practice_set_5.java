import java.util.Scanner;
public class Practice_set_5 {
    public static void main(String[] args) {
        //Practice Set -5
        //1)
        /* 
       for (int i=4; i>=1; i--) {
           for (int j=0; j<=i; j++){
               System.out.print("*");
           }
           System.out.print("\n");
       }
           */

        //2)
        /* 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       int sum = 0;
       int i = 0;
       while (i<n){
           sum = sum + (2*i);
           i++;
       }
       System.out.printf("The sum of first %d even number: %d",n,sum);
*/


        //3)
        /* 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       int i=1;
       while(i<=10){
           System.out.println(n*i);
           i++;
       }
           */

        //4)
        /* 
       int i = 10;
       while (i >= 1){
           System.out.println(i*10);
           i--;
       }
           */

        //5)
        //using while loop
        /* 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       int fact = 1;
       int i = 1;
       while (i<=n){
           fact = fact*i;
           i++;
       }
       System.out.println(fact);
       */

        //using for loop
        /* 
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter The Number: ");
       int n = sc.nextInt();
       int fact = 1;
       for (int i=1; i<=n; i++){
           fact = fact*i;
       }
       System.out.printf("The factorial of %d : %d",n,fact);
       */

        //6)
        /* 
       int i = 1;
       while (i<=5){
           System.out.println(5);
           i++;
       }
           */

        //7)
        //using for loop
        /* 
       System.out.println("Using for loop");
       for (int n=1; n<=5; n++){
           System.out.println(1);
       }

       //using while loop
       System.out.println("Using while loop:");
       int y = 1;
       while (y <= 5) {
           System.out.println(1);
           y++;
        }
           */

        //8)
        //True

        //9)
        /* 
       int sum = 0;
       for (int i=1; i<=10; i++){
           int b = 8*i;
           sum = sum + b;
       }
       System.out.printf("The sum of all number occurring in table of 8: %d",sum);
        */

        //10)
        //1)At least once

        //11)
        for (int i=1; i<=10; i++){
            System.out.println(2);
        }
    }
}
