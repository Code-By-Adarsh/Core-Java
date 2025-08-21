import java.util.InputMismatchException;
import java.util.Scanner;
class ZeroError extends Exception{
    @Override
    public String toString() {
        return "Error -> The value of second number cannot be 0.";
    }
}
public class Project_5_custom_calculator {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int divide(int a,int b) throws ZeroError{
        if(b==0){
            throw new ZeroError();
        }
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("-----------Menu-----------");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Exit");

        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.println(" ");
                System.out.print("What do you want to do : ");
                int x = sc.nextInt();
                if(x==1){
                    try{
                        System.out.print("Enter first number : ");
                        int a = sc.nextInt();
                        System.out.print("Enter second number : ");
                        int b = sc.nextInt();
                        int c = sum(a,b);
                        System.out.printf("The addition of %d and %d is : %d",a,b,c);
                    }catch (Exception e){
                        System.out.println("Only integer are allowed.");
                    }

                } else if (x==2) {
                    try{
                        System.out.print("Enter first number : ");
                        int a = sc.nextInt();
                        System.out.print("Enter second number : ");
                        int b = sc.nextInt();
                        int c = minus(a,b);
                        System.out.printf("The subtraction of %d and %d is : %d",a,b,c);
                    }catch (Exception e){
                        System.out.println("Only integer are allowed.");
                    }

                }else if (x==3) {
                    try{
                        System.out.print("Enter first number : ");
                        int a = sc.nextInt();
                        System.out.print("Enter second number : ");
                        int b = sc.nextInt();
                        int c = mul(a,b);
                        System.out.printf("The multiplication of %d and %d is : %d",a,b,c);
                    }catch (Exception e){
                        System.out.println("Only integer are allowed.");
                    }

                }else if (x==4) {
                    System.out.print("Enter first number : ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number : ");
                    int b = sc.nextInt();
                    int c;
                    try {
                        c = divide(a, b);
                        System.out.printf("The division of %d and %d is : %d",a,b,c);
                    } catch (ZeroError e) {
                        System.out.println(e);
                    }

                } else if (x==5) {
                    System.out.println("Thanks for using this time saving calculator.");
                    System.out.println("Goodbye,Have a nice day!");
                    break;
                }else {
                    System.out.println("Invalid input! please enter between(1-5).");
                }
            }catch (InputMismatchException e){
                System.out.println("Only integer(1-5) are allowed.");
                sc.nextLine();
            }
        }
    }
}

