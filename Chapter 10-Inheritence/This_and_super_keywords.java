class giyu{
    public int c;
    public giyu(){
        System.out.println("I am constructor of giyu class.");
    }
    public giyu(int a){
        System.out.println("I am overloaded constructor of giyu class with value of a: "+a);
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
        System.out.println("I am constructor of tomioka class.");
    }
    public tomioka(int a,int b){
        super(a);
        System.out.println("I am overloaded constructor of tomioka class with value of b: "+b);
    }
}
public class This_and_super_keywords {
    public static void main(String[] args) {
        /*
        giyu num = new giyu();
        num.c = 5;
        num.setC(6);
        System.out.println(num.getC());
         */

        tomioka t = new tomioka(7,8);
    }
}
