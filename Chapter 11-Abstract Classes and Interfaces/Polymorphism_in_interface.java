interface Camera1{
    void takephoto();
    void takevideo();
}
interface Map1{
    void sharelocation();
    void mylocation();
    //default method:---------------> Can be override in the class.
    private void greet(){
        System.out.println("Good Morning.....");
    }
    default void find(){
        greet();
        System.out.println("Searching.....");
    }
}
class Cellphone1{
    public void number(int phonenumber){
        System.out.println("calling....."+phonenumber);
    }
    public void connecting(){
        System.out.println("Connecting.....");
    }
}
class Smartphone1 extends Cellphone1 implements Camera1, Map1 {
    public void takephoto(){
        System.out.println("Photo start.");
    }
    public void takevideo(){
        System.out.println("Video start.");
    }
    public void sharelocation(){
        System.out.println("Share location.");
    }
    public void mylocation(){
        System.out.println("My location.");
    }
    public void me(){
        System.out.println("Roni");
    }
}
public class Polymorphism_in_interface {
    public static void main(String[] args) {
        /*
        Smartphone1 s = new Smartphone1();
        s.takephoto();
        s.takevideo();
        s.sharelocation();
        s.mylocation();
        s.connecting();
        s.number(92359433);
        s.find();
         */
        Map1 m = new Smartphone1();//----->This is smartphone but use it as a map.
        m.sharelocation();
        //m.takephoto();------------>Not allowed.
        //m.me();---------------->Not allowed.

    }

}


