import java.util.Scanner;

public class Practice_set_14 {
    public static void main(String[] args) {
        //1)
        //refer Error_demo.java file

        //2)
        /*
        int a = 4;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter number: ");
            int b = sc.nextInt();
            System.out.printf("The value of %d/%d is : "+a/b,a,b);
        } catch (ArithmeticException e1){
            System.out.println("Haha");
            System.out.println(e1);
        } catch (Exception e){
            System.out.println("Hihi");
            System.out.println(e);
        }
         */

        //3)
        int [] marks = {17,15,16,18,19};
        while (true){
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter index number : ");
                int a = sc.nextInt();
                System.out.printf("The value at index of %d is : "+marks[a],a);
                System.out.println();
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error");
                break;
            }
        }
    }
}

