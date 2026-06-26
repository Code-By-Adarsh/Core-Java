package Chapter10_Inheritence;

class giyu{
    public int c;
    public giyu(){
        System.out.println("I am constructor of Chapter10_Inheritence.giyu class.");
    }
    public giyu(int a){
        System.out.println("I am overloaded constructor of Chapter10_Inheritence.giyu class with value of a: "+a);
    }
    public void setC(int x){
        this.c = x;
    }
    public int getC(){
        return c;
    }
}
class tomioka extends giyu{
    public tomioka(){
        System.out.println("I am constructor of Chapter10_Inheritence.tomioka class.");
    }
    public tomioka(int a,int b){
        super(a);
        System.out.println("I am overloaded constructor of Chapter10_Inheritence.tomioka class with value of b: "+b);
    }
}
public class This_and_super_keywords {
    public static void main(String[] args) {
        /*
        Chapter10_Inheritence.giyu num = new Chapter10_Inheritence.giyu();
        num.c = 5;
        num.setC(6);
        System.out.println(num.getC());
         */

        tomioka t = new tomioka(7,8);
    }
}
