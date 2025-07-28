class phone{
    public void greet(){
        System.out.println("Hi Good Morning.");
    }
    public void name(){
        System.out.println("I am java in class One.");
    }
}
class smartphone extends phone{
    public void wel(){
        System.out.println("Your welcome.");
    }
    public void name(){
        System.out.println("I am java in class two.");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        //phone obj = new phone();  //Allowed
        //smartphone smobj = new smartphone();   //Allowed


        // Refferrence of superclass = object of subclass but vice-versa is not true.
        phone obj = new smartphone();  //yes its also allowed.
        obj.greet();
        obj.name();
        smartphone obj1 = new smartphone();
        obj1.wel();

    }
}
