interface Camera{
    void takephoto();
    void takevideo();
}
interface Map{
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
class Cellphone{
    public void number(int phonenumber){
        System.out.println("calling....."+phonenumber);
    }
    public void connecting(){
        System.out.println("Connecting.....");
    }
}
class Smartphone extends Cellphone implements Camera,Map{
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
}
public class Default_methods {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.takephoto();
        s.takevideo();
        s.sharelocation();
        s.mylocation();
        s.connecting();
        s.number(92359433);
        s.find();
    }
}

