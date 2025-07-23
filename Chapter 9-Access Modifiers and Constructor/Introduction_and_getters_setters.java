class Demons{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int a){
        id = a;
    }
    public int getId(){
        return id;
    }

}
public class Introduction_and_getters_setters {
    public static void main(String[] args) {
        Demons giyu = new Demons();
        // giyu.id=45;
        // giyu.name="Tomioka";  ------> Throws error due to private access modifiers.
        giyu.setName("Tomioka Giyu");
        System.out.println(giyu.getName());

        //Access Modifiers - Specifies where a method property is accessible.
        //There are 4 types:
        //1) Private 2) Default 3) Protected 4) Public
        // Getter - Return the value(accessor).
        //Setter - Sets/Update the value(mutators).
    }
}
