//For example:
interface naruto{
    void kick();
}
class fight implements naruto{
    public void kick(){
        System.out.println("Hi my name is Naruto uzumaki.");
    }
}
public class Introduction_to_Interfaces {
    public static void main(String[] args) {
        //Interfaces - In java interfaces is a group of related methods with empty bodies.
        fight f = new fight();
        f.kick();
    }
}

