class Hashira{
    private int id;
    private String name;
    private String quality;

    /*
    public Hashira(){  // -----> Constructor
        id = 45;
        name = "Senami";
    }
     */
    public Hashira(String myName ,int n, String type){  // ----> Constructor with arguments
        id = n;
        name = myName;
        quality = type;
    }

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
    public String getType(){
        return "Type: "+quality;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Hashira giyu = new Hashira("Muichiro Tokito",52,"Smoke");
        //giyu.setName("Tomioka Giyu");
        //giyu.setId(52);
        System.out.println(giyu.getId());
        System.out.println(giyu.getName());
        System.out.println(giyu.getType());

        // Method overloading is also possible in case of constructor.
    }
}


