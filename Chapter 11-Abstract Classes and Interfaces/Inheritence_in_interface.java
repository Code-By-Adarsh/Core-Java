interface sample1{
    void meth1();
    void meth2();
}
interface sample2 extends sample1{
    void meth3();
    void meth4();
}
class adarsh implements sample1,sample2{
    public void meth1(){
        System.out.println("Method-1");
    }
    public void meth2(){
        System.out.println("Method-2");
    }
    public void meth3(){
        System.out.println("Method-3");
    }
    public void meth4(){
        System.out.println("Method-4");
    }
}
public class Inheritence_in_interface {
    public static void main(String[] args) {
        adarsh a = new adarsh();
        a.meth1();
        a.meth2();
        a.meth3();
        a.meth4();
    }
}

