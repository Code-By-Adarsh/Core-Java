@FunctionalInterface
interface demoAno{
    void meth1();
    //void meth2();
}
/*
class adarsh implements demoAno{
    @Override
    public void meth1(){
        System.out.println("I am meth1.");
    }
}
 */
/*
class AnonyDemo implements demoAno {
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth1 of a1.");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth2 of a1.");
    }
}
 */
public class Demo {
    public static void main(String[] args) {
        //Anonymous class:
        /*
        AnonyDemo a1 = new AnonyDemo();
        a1.meth1();
        a1.meth2();
         */
        /*
        demoAno a2 = new demoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth1 of a2.");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth2 of a2.");
            }
        };
        a2.meth1();
        a2.meth2();
         */

        //Lambda Expressions (Added in java-8):

        //demoAno obj = new adarsh();
        //obj.meth1();

        demoAno obj = ()->{
            System.out.println("I am method1.");
        };
        obj.meth1();

    }
}