import java.util.Arrays;
import java.util.Scanner;
public class Handling_specific_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = {78,85,96};
        try{
            System.out.print("Enter the index number: ");
            int a = sc.nextInt();
            System.out.printf("The marks at the index %d is : %d",a,marks[a]);
            System.out.println(" ");
            System.out.printf("Enter the value by which you want to divide %d : ",marks[a]);
            int b = sc.nextInt();
            System.out.printf("The value we get by dividing the %d by %d is : "+marks[a]/b,marks[a],b);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error occurred.");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("ArrayIndexOutOfBoundsException error occurred.");
            System.out.println(e1);
        }catch (Exception e2){
            System.out.println("Some error occurred.");
            System.out.println(e2);
        }
    }
}

