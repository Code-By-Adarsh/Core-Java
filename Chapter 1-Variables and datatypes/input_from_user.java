import java.util.Scanner;
public class input_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.printf("Hi %s",name);
    }
}
