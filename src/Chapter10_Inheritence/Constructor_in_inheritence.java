package Chapter10_Inheritence;

class Base1{
    public int x;
    public Base1(){
        System.out.println("I am constructor of Chapter10_Inheritence.Base1 class.");
    }
    public Base1(int x){
        System.out.println("I am overloaded constructor of Chapter10_Inheritence.Base1 class with value of x: "+x);
    }
    public void setX(int a){
        x = a;
    }
    public int getX(){
        return x;
    }
}
class Derived1 extends Base1{
    public int y;
    public Derived1(){
        //super(0);
        System.out.println("I am a constructor of Chapter10_Inheritence.Derived1 class.");
    }
    public Derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of Chapter10_Inheritence.Derived1 class with value of y: "+y);
    }
    public void setY(int a){
        y = a;
    }
    public int getY(){
        return y;
    }
}
class childOfDerived extends Derived1{
    public childOfDerived(){
        System.out.println("I am a constructor of Chapter10_Inheritence.childOfDerived class.");
    }
    public childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of Chapter10_Inheritence.childOfDerived class with value of z: "+z);
    }
}
public class Constructor_in_inheritence {
    public static void main(String[] args) {
        //Chapter10_Inheritence.Base1 b = new Chapter10_Inheritence.Base1();
        //takes automatically constructor from Chapter10_Inheritence.Base1 class when itself constructor is not created.
        //Chapter10_Inheritence.Derived1 d = new Chapter10_Inheritence.Derived1();
        //Chapter10_Inheritence.Derived1 d = new Chapter10_Inheritence.Derived1(15,30);
        //Chapter10_Inheritence.childOfDerived c = new Chapter10_Inheritence.childOfDerived();
        childOfDerived c = new childOfDerived(10,20,30);

    }
}
