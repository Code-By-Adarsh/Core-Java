import java.util.Scanner;
public class Introduction_string{
public static void main(String[] args) {
        //Strings are immutable and cannot be changed.
        String name = "Adarsh";
        //String name = new String("Adarsh");
        System.out.println("My name is: "+name);
        System.out.print(name+"\n");
        int a = 6;
        float b = 6.545678f;
        System.out.printf("The value of a is %d and b is %.2f%n",a,b);
        System.out.format("The value of a is %d and b is %8.2f%n",a,b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(st);
        String st1 = sc.next();
        System.out.println(st1);

        // \n---> for new line
        // \t---> for space
    }
}