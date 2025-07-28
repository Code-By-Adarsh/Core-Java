class Base{
    public int x;
    public void setX(int a){
        x = a;
    }
    public int getX(){
        return x;
    }
    public void printMe(){
        System.out.println("I am code of Base.");
    }
}

class Derived extends Base{
    private int y;
    public void setY(int a){
        y = a;
    }
    public int getY(){
        return y;
    }
    public void printMe(){
        System.out.println("I am code of Derived.");
    }
}
class Animal{
    public int a;
    public int getA(){
        return a;
    }
    public void show(){
        System.out.println("Now we are in Animal class.");
    }
}
class Dog extends Animal{
    public void show1(){
        System.out.println("Now we are in Dog class.");
    }
}
public class Introduction_to_inheritence {
    public static void main(String[] args) {
        /*
        Derived adarsh = new Derived();
        adarsh.setX(52);
        System.out.println(adarsh.getX());
        adarsh.printMe();
         */

        // Inheritance --> It is used to borrow property and methods from an existing class.

        //creating object in Animal class:
        Animal gojo = new Animal();
        gojo.a = 52;
        System.out.println(gojo.getA());
        gojo.show();

        //creating object in Dog class:
        Dog saturo = new Dog();
        saturo.a = 53;
        System.out.println(saturo.getA());
        saturo.show();
        saturo.show1();
    }
}
