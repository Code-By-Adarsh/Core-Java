//4)
@FunctionalInterface
interface myfunctionalinterface{
    void run();
    //void bug();  --------------->Throws an error.
}
class base{
    public void call(){
        System.out.println("I am coming.");
    }
}
class derived extends base{
    //1)
    @Override
    public void call(){
        System.out.println("I am coming again.");
    }

    //2)
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }
}
public class Annotation {
    //3)
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //Definition-->Used to provide extra information about a program.It provides metadata to classes/methods.
        derived d = new derived();
        d.call();
        System.out.println(d.sum(5,5));
    }
}