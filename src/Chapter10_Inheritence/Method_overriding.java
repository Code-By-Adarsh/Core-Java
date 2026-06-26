package Chapter10_Inheritence;

class A{
    public int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class Chapter10_Inheritence.A.");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class Chapter10_Inheritence.B.");
    }
    public void meth3(){
        System.out.println("I am method 3 of class Chapter10_Inheritence.B.");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
