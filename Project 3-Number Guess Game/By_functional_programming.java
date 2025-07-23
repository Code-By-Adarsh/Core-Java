import java.util.Scanner;
import java.util.Random;
public class By_functional_programming {
    public static void main(String[] args) {
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");
        Random rand = new Random();
        int ans = rand.nextInt(1,101);
        int count = 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter your number : ");
            int your = sc.nextInt();
            if (your >=1 && your <= 100){
                if (your < ans){
                    System.out.println("\uD83D\uDCC9 Too low! Try a greater number.");
                }else if (your > ans){
                    System.out.println("\uD83D\uDCC8 Too high! Try a smaller number.");
                }else {
                    System.out.println("Woo You choose ✅ right!");
                    System.out.printf("\uD83C\uDF89 You took %d chance to guess.",count);
                    break;
                }
            }else {
                System.out.println("Invalid entry ❌ .Please enter valid answer between 1 and 100.");
            }
            count++ ;
        }


    }
}
