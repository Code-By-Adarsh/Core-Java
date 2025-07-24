import java.util.Scanner;
import java.util.Random;
class numberGuessGame{
    private final int answer;
    private int attempts = 1;
    private final Scanner sc = new Scanner(System.in);

    //Constructor:
    public numberGuessGame(){
        Random rand = new Random();
        answer = rand.nextInt(1,101);
    }

    //Method to start the game:
    public void startGame(){
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");
        while (true){
            System.out.print("Enter your answer: ");
            if (sc.hasNextInt()){
                int userInput = sc.nextInt();
                if (userInput >= 1 && userInput <= 100){
                    if (userInput > answer){
                        System.out.println("📈 Too high! Try a smaller number.");
                    } else if (userInput < answer) {
                        System.out.println("📉 Too low! Try a greater number.");
                    }else {
                        System.out.println("✅ Woohoo! You guessed the correct number!");
                        System.out.printf("\uD83C\uDF89 You took %d chance to guess.",attempts);
                        break;
                    }
                }else {
                    System.out.println("❗ Please enter a number between 1 and 100.");
                }
            }else {
                System.out.println("❌ Invalid input! Please enter a number.");
                sc.next();
            }
            attempts++ ;
        }
    }

}
public class By_oops {
    public static void main(String[] args) {
        numberGuessGame game = new numberGuessGame();
        game.startGame(); 
    }
}
