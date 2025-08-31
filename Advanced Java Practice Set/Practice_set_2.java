import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

///**
// * This is the class for Practice set Question-1.
// * <P><i>Good Morning.</i></P>
// * @author Adarsh Mishra
// * @version 2.1.0
// * @since 2004
// * @see <a href="https://docs.oracle.com/en/java/javase/24/docs/api/index.html" target="_blank">Java docs</a>
// */
//class sum1{
//    /**
//     * This is method to add two number.
//     * @param a This is first integer to add.
//     * @param b This is second integer to add.
//     * @return This return the result of a+b.
//     * @throws Exception if a is equal to 0.
//     */
//    public int add(int a,int b) throws Exception{
//        if (a==0){
//            throw new Exception();
//        }
//        return a+b;
//    }
//}

class dep{
    @Deprecated
    public void run(){
        System.out.println("I am method-1.");
    }
}

interface adarsh{
    void roni();
}
public class Practice_set_2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //1)
        /*
        sum1 s = new sum1();
        try {
            System.out.println(s.add(5,5));
        } catch (Exception e) {
            e.printStackTrace();
        }
         */

        //2)
        /*
        dep d = new dep();
        d.run();
         */

        //3)
        /*
        dep d = new dep();
        d.run();
         */

        //4)
        /*
        adarsh a = new adarsh() {
            @Override
            public void roni() {
                System.out.println("She is beautiful.");
            }
        };
        a.roni();
         */

        //5)
        File myfile = new File("Multiplication.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String table = "";
        for (int j=1;j<=10;j++){
            table += a+"X"+j+"="+a*j;
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("Multiplication.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}