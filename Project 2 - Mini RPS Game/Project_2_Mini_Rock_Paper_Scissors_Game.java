import java.util.Random;
import java.util.Scanner;
public class Project_2_Mini_Rock_Paper_Scissors_Game {
        public static void main(String[] args) {
            System.out.println("---Welcome To Rock Paper Scissor Game---");
            System.out.println("Note:-Here are the fight between you and computer.");
            System.out.println("\nPlease follow the given instruction:---");
            System.out.println("\nRule 1-You have only one chance to choose and after that your choice will competate with computer choice.");
            System.out.println("\nRule 2-Please follow given value convention:--\n1-->Rock\n2-->Paper\n3-->Scissor.");
            System.out.println("\nRule 3-i)Rock > Scissor.\nii)Scissor > Paper.\niii)Paper > Rock.");

            String playAgain;
            do{
            Random rand = new Random();
            int p1 = rand.nextInt(1, 4);
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter your choice: ");
            int p = sc.nextInt();
            int p2 = 0;
            String[] options = {"Rock","Paper","Scissor"};
            if (p >= 1 && p <= 3) {
                p2 = p;
                if (p1 == p2){
                    System.out.println("Result --> Match drawn.");
                    System.out.printf("Computer choose %s and you choose %s.",options[p1-1],options[p2-1]);
                }else if ((p1 == 1 && p2 == 3) || (p1 == 3 && p2 == 2) || (p1 == 2 && p2 == 1)){
                    System.out.println("Result --> You lose.Try your best next time.");
                    System.out.printf("Computer choose %s and you choose %s.",options[p1-1],options[p2-1]);
                }else {
                    System.out.println("Result --> You won.Hip Hip Hurray!");
                    System.out.printf("Computer choose %s and you choose %s.",options[p1-1],options[p2-1]);
                }
            } else {
                System.out.println("Please enter valid choice between 1 and 3.");
            }
            System.out.print("\nAre you want to play again(yes/no): ");
            playAgain = sc.next();
        }while(playAgain.equalsIgnoreCase("yes"));
    }
}

