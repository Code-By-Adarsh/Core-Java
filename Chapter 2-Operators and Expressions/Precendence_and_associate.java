public class Precendence_and_associate {
    public static void main(String[] args) {
        //Precedence and Associative
        int a = 4*2-4/2;  //6
        int b = 20/2-4*2;  //2
        System.out.println(a);
        System.out.println(b);

        //Quick Quiz
        //1)(x-y)/2
        //2)(b*b-4ac)/2a
        //3)v*v-u*u
        //4)a*b-c
        int x = 6;
        int y = 1;
        System.out.println(x*y/2);
        System.out.println((x*y)/2);
        System.out.println(5%2); //show remainder because modulus operator
        System.out.println(5/2); //show quotient because divide operator

        //post and pre increment and decrement
        int m = 2;
        ++m;
        System.out.println(m);
        int n = 2;
        n++;
        System.out.println(n);
    }
}
