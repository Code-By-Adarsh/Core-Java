package Chapter1_VariablesAndDataType;
import java.util.Scanner;
public class input_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.printf("Hi %s",name);
        sc.close();
    }
}

//Understanding
/*
->import java.util.Scanner;
means : Sabse pehle ye samajh.
Java me bahut sari ready-made classes already bani hui hain.
Example Scanner ArrayList HashMap Random Math
Ye sab Java ne pehle se bana rakha hai.
Scanner bhi unhi me se ek hai.

--------------------------------
Ye kaha hai?
java
   │
   └── util
           │
           ├── Scanner
           ├── ArrayList
           ├── HashMap
Isliye likhte hain
import java.util.Scanner;
Matlab
"Java, mujhe Scanner class use karni hai."

-----------------------------------
-->Scanner sc = new Scanner(System.in);
Scanner -> class
sc -> variable
new -> for creating new object
System.in -> input from keyboard
sc.nextLine() -> for taking the input
sc.close() -> fro closing sc it is method

---------------------------------------
printf -> formatting printing
it uses the placeholder
%f for floating
%s for string
%d for integer
 */
