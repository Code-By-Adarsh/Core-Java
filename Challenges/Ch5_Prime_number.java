import java.util.*;

public class Ch5_Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check prime or not: ");
        int a = sc.nextInt();
        if (a <= 1) {
            System.out.printf("%d is not a Prime Number.", a);
            return;
        }
        boolean isPrime = true;
        for (int i=2; i<=Math.sqrt(a); i++){
            if (a % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.printf("The given number %d is a Prime Number.",a);
        }else {
            System.out.printf("The given number %d is not a Prime Number.",a);
        }
    }
}