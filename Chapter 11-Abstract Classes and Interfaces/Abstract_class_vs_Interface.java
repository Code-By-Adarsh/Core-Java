interface bycycle{
    public int a = 45;
    public void breakup(int decrement);
    public void speedup(int increment);
}
interface demons{
    void kukoshibo();
    void mujan();
}
class my implements bycycle,demons{
    public void hello(){
        System.out.println("Hi hello");
    }
    public void breakup(int decrement){
        System.out.println("Apply break");
    }
    public void speedup(int increment){
        System.out.println("Apply speed");
    }
    public void kukoshibo(){
        System.out.println("Hi kukoshibo");
    }
    public void mujan(){
        System.out.println("Hi mujan");
    }
}
public class Abstract_class_vs_Interface {
    public static void main(String[] args) {
        my cycle = new my();
        cycle.breakup(52);
        cycle.speedup(52);
        cycle.kukoshibo();
        cycle.mujan();
        cycle.hello();
        System.out.println(cycle.a);
        //you cannot modify properites of interfaces as they are final but you can change that in child class.
        //cycle.a = 25; --> Throws an error;

    }
}

