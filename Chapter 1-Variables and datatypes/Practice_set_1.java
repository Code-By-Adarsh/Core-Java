import java.util.Scanner;
public class Practice_set_1 {
    public static void main(String[] args) {
        //Question 1
        int a = 5;
        int b = 9;
        int c = 10;
        System.out.println("Sum--->"+(a+b+c));
        System.out.println("-------------------------");

        //Question 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st Subject Marks:");
        int a1 = sc.nextInt();
        System.out.print("Enter your 2nd Subject Marks:");
        int b1 = sc.nextInt();
        System.out.print("Enter your 3rd Subject Marks:");
        int c1 = sc.nextInt();
        double answer1 = ((a1 + b1 + c1)/300.0)*10;
        System.out.println("Your CGPA is:"+answer1);
        System.out.println("-------------------------");

        //Question 3
        sc.nextLine();
        System.out.println("Enter your name:");
        String s1 = sc.nextLine();
        System.out.println("Hello "+s1+"! Have a great day.");
        System.out.println("-------------------------");

        //Question 4
        System.out.println("Enter the Distance(km):");
        double a2 = sc.nextDouble();
        double answer2 = a2*1000;
        System.out.println("The distance given by you in (meter): "+answer2);
        System.out.println("-------------------------");

        //Question 5
        System.out.println("Enter your Number:");
        //int e = sc.nextInt();
        System.out.println(sc.hasNextInt());
    }
}
