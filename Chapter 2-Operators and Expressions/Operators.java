public class Operators{
    public static void main(String[] args) {
        //1)Airthmetic Operator--> +,-,/,*,%
        //2)Comparsion operator--> ==,>=,<=,!=
        //3)Assingment operator-->=,+=,-=,*=
        //4)Logical operator-->&&,||,!
        //5)Bitwise Operator-->&,|
        int a = 4;
        int b = 6 + a; //airthmetic operator
        b += 5;  //assignment operator
        System.out.println(b != 10);  //comparsion operator
        System.out.println(b>8 || b>20); //logical operator
        System.out.println(7/3); //2
        System.out.println(7%3);  //1
    }

}
