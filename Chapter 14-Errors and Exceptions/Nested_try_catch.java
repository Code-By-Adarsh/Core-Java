import java.util.Scanner;
public class Nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {56,45,78};
        try{
            System.out.println("Welcome to the Nested try-catch practice session.");
            while (true){
                try{
                    System.out.print("Enter the index number : ");
                    int a = sc.nextInt();
                    System.out.printf("The value at the index of %d in marks is : %d",a,marks[a]);
                    System.out.println(" ");
                }catch (ArrayIndexOutOfBoundsException a){
                    System.out.println(a);
                    break;
                }
            }
            }catch (Exception e){
                 System.out.println(e);
        }
        System.out.println("Thanks for using this program.");
    }
}

