abstract class Base{
    public Base(){
        System.out.println("I am constructor of base class.");
    }
    public void say(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Derived extends Base{
    @Override
    public void greet(){
        System.out.println("Hi good morning.");
    }
}
abstract class Derived1 extends Base{
    public void wel(){
        System.out.println("Welcome");
    }
}
public class Abstract_classes_and_Abstract_methods {
    public static void main(String[] args) {
        //Abstract means "Khayali pulav"
        //Abstract Method - A method is declared without implementation.
        //For ex: abstract void my(double x,double y)

        //Abstract class - If a class include an abstract method then the class itself must be abstract class.
        Derived d = new Derived();
        d.greet();
        //Derived1 d1 = new Derived1();--> Throws error.
        //Base b = new Base();--> Throws error.
    }
}
