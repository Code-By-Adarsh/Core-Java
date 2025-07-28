class Base1{
    public int x;
    public Base1(){
        System.out.println("I am constructor of Base1 class.");
    }
    public Base1(int x){
        System.out.println("I am overloaded constructor of Base1 class with value of x: "+x);
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
        System.out.println("I am a constructor of Derived1 class.");
    }
    public Derived1(int x,int y){
        super(x);
        System.out.println("I am a overloaded constructor of Derived1 class with value of y: "+y);
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
        System.out.println("I am a constructor of childOfDerived class.");
    }
    public childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of childOfDerived class with value of z: "+z);
    }
}
public class Constructor_in_inheritence {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //takes automatically constructor from Base1 class when itself constructor is not created.
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(15,30);
        //childOfDerived c = new childOfDerived();
        childOfDerived c = new childOfDerived(10,20,30);

    }
}
