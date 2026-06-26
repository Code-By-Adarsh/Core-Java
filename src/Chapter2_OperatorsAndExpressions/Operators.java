package Chapter2_OperatorsAndExpressions;

public class Operators{
    public static void main(String[] args) {
        //1)Arithmetic Operator--> +,-,/,*,%
        //2)Comparison operator--> ==,>=,<=,!=
        //3)Assignment operator--> =,+=,-=,*=,/=
        //4)Logical operator--> &&,||,!
        //5)Bitwise Operator--> &,|
        int a = 4;
        int b = 6 + a; //arithmetic operator
        b += 5;  //assignment operator
        System.out.println(b != 10);  //comparison operator //true
        System.out.println(b>8 || b>20); //logical operator //true
        System.out.println(7/3); //2
        System.out.println(7%3);  //1
    }

}
