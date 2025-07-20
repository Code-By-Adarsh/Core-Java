public class Recursion {
    static int factorial1(int n) {
        //Factorial(n) = n*(n-1)*.....*1;
        //Factorial(n) = n*factorial(n-1);
   //---->Factorial:
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial1(n - 1);
        }
    }
  //-----> Using for loop:
        /*
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
         */
    public static void main(String[] args) {
        System.out.println("The factorial of 7 is : "+factorial1(7));
        //System.out.println("The fibonacci series up to 7 terms is : "+ fibonacci(7));

    }
}


