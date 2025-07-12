import java.util.Scanner;
public class If_else_statements {
    public static void main(String[] args) {
        int age = 18;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int answer = sc.nextInt();

        //Logical Operator
        if (answer >= age && answer <= 100){
            System.out.printf("Your age is %d so you can drive!",answer);
        }

        //Relational Operator
        else if (answer > 100) {
            System.out.println("Please enter valid age.");
        } else{
            System.out.printf("Your age is %d so you cannot drive yet!",answer);
        }


    }
}
