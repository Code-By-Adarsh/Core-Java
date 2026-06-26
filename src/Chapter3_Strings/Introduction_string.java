package Chapter3_Strings;

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
        System.out.printf("The value of a is %d and b is %.2f\n",a,b);
        System.out.format("The value of a is %d and b is %8.3f\n",a,b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(st);
        String st1 = sc.next();
        System.out.println(st1);

        System.out.print("Enter age: ");
        int age =  sc.nextInt();
        sc.nextLine(); //-->consume leftover newline
        System.out.print("Enter name: ");
        String name1 = sc.nextLine();
        System.out.println(age);
        System.out.println(name1);

        // \n---> for new line
        // \t---> for space

        //-------->Understanding
        /*
        1. String Declaration
String name = "Adarsh";
Ye String Literal hai.
Java memory me Strings ke liye ek special area hota hai jise String Constant Pool (SCP) kehte hain.
String Pool
-------------
"Adarsh"
name variable usi object ko point karega.

// String name = new String("Adarsh");
Ye dusra tarika hai String banane ka.
Isme heap memory me naya object banta hai.
Heap
---------
Adarsh
Chahe "Adarsh" String Pool me pehle se ho, new use karne se naya object banega.
Interview me ye difference bahut puchte hain.
------------------------------------------------------------

%n
New line.
Ye \n jaisa hi hai.
Difference:
%n platform independent hota hai.
Interview me ye point puchh sakte hain.
--------------------------------------------------------------

%8.2f
Iska matlab
Total width = 8
Decimal = 2
Example
6.55
Actually print hoga
    6.55
Kyuki total 8 spaces reserve ki gayi hain.
Visualization
|    6.55|
Agar width kam ho
123456789.45
to poori value hi print hogi.
         */
    }
}