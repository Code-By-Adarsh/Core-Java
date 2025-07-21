import java.util.Random;  //learning use of Random.
class Gojo{
    int id;
    String name;
    int salary;
    public void show(){
        System.out.println("My bro name is "+name);
        System.out.println("And its id is "+id);
        System.out.println("And its salary is "+salary);
    }
    public int get_salary(){
        return salary;
    }
}
public class Our_first_custom_class {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("This is our first custom class.");
        Gojo bro = new Gojo();
        bro.id = rand.nextInt(50,100);
        bro.name="Gojo Stauro";
        bro.salary= rand.nextInt(50,100);
        //System.out.println(bro.id);
        //System.out.println(bro.name);
        bro.show();

    }
}


