class c1{
    public int a = 18;
    protected int b = 20;
    int c = 22;
    private int d = 24;
    //In class:
    public void math(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Access_modifiers {
    public static void main(String[] args) {
        c1 m = new c1();
        //m.math();
        //In package:
        /*
        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(m.c);
        //System.out.println(m.d);  ----->Throws an error.Not possible.
         */

        //Modifiers (Public,Protected,Default,Private)
        //In class(Y,Y,Y,Y)
        //In package(Y,Y,Y,N)
        //In Subclass(Y,Y,N,N)
        //In World(Y,N,N,N)
    }
}

