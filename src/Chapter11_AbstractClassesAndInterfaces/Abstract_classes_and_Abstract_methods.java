package Chapter11_AbstractClassesAndInterfaces;

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
        //For ex: abstract void Chapter11_AbstractClassesAndInterfaces.my(double x,double y)

        //Abstract class - If a class include an abstract method then the class itself must be abstract class.
        Derived d = new Derived();
        d.greet();
        //Chapter11_AbstractClassesAndInterfaces.Derived1 d1 = new Chapter11_AbstractClassesAndInterfaces.Derived1();--> Throws error.
        //Chapter11_AbstractClassesAndInterfaces.Base b = new Chapter11_AbstractClassesAndInterfaces.Base();--> Throws error.
    }
}
