import java.util.Scanner;
public class Project_1_CBSE_Percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("-----CBSE Board Percentage Calculator-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st Subject Marks:");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd Subject Marks:");
        int b = sc.nextInt();
        System.out.println("Enter your 3rd Subject Marks:");
        int c = sc.nextInt();
        System.out.println("Enter your 4th Subject Marks:");
        int d = sc.nextInt();
        System.out.println("Enter your 5th Subject Marks:");
        int e = sc.nextInt();
        double answer = ((a+b+c+d+e)/500.0)*100;
        System.out.println("Your percentage is:"+ answer+"%");
    }
}
