import java.util.*;

public class Ch4_Factorial {
    public static void factorial(int a){
        //1st way: By iteration(loop)
        int answer = 1;
        for (int i=1; i<=a; i++){
            answer *= i;
        }
        System.out.printf("The factorial of %d is: %d",a,answer);
    }
    //2nd way:
    /*
    public static int factorialRecursive(int a){
        //2nd way: By recursion
        if (a == 0 || a == 1) {
            return 1;  // base case
        } else {
            return a * factorialRecursive(a - 1);
        }
    }
     */
    public static void main(String[] args) {
        System.out.println("\n---------------------My Solution------------------------");
        //Factorial of 3 = 1X2X3 = 6.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of that you want factorial: ");
        int a = sc.nextInt();
        factorial(a);

        System.out.println("\n\n--------------------Bookish Solution------------------------");
        int num = 5, factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}