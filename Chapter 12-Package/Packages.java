//import java.util.Scanner;
import java.util.*;
public class Packages {
    public static void main(String[] args) {
        //Packages--> A package is used to group of related classes.Packages help in avoiding naming conflicts.
        //There are two types of packages:
        //1)Built-in packages(Java API)
        //2)User defined packages(Custom package)
        Scanner sc = new Scanner(System.in);
        //java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.println("The number is : "+a);
        //for creating packages in java use this command:
        //javac -d . adarsh.java
        //for multiple------> javac -d . *.java
    }
}

