import java.util.Scanner;
public class Try_catch_block {
    public static void main(String[] args) {
        //Exception in java:
        //An exception is an event that occurs when a program is executed disrupting the normal flow of instructions.

        //There are normally two types of exception in java:
        //1)Checked exception(compile time execution and handled by compile:for ex-->Thread.sleep()).
        //2)Unchecked exception(runtime exception)


        int a = 5000;
        int b = 0;
        try{
            int c = a/b;
            System.out.printf("The value of %d/%d is : %d",a,b,c);
        }catch (Exception e){
            System.out.println("The value of b cannot be 0.");
            System.out.println(e);
        }

    }
}

