import java.util.Scanner;
class exp1 extends Exception{
    @Override
    public String toString() {
        return "I am toString().";
    }

    @Override
    public String getMessage() {
        return "I am getMessage().";
    }
}
public class The_Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a<100){
            try{
                //throw new exp1();
                throw new ArithmeticException("I am arithmetic exception.");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished.");
            }
        }
    }
}
