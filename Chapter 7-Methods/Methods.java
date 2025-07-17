public class Methods {
    static int logic(int x,int y){
        int z ;
        if (x>y){
            z = x - y;
        }else {
            z = y - x;
        }
        return z;
    }

    //A method is a function written inside the class because java is oops language so every method is a function.
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c;
        /*
        if(a>b){
            c = a - b;
        }else {
            c = b - a;
        }
        System.out.println(c);
         */
        /*  -------> when we do not write static then we create object like this:
        Methods obj = new Methods();
        c = obj.logic(a,b);

         */
        // ---------------> when we write static we access like this :
        c = logic(a,b);
        System.out.println(c);

        int a1 = 3;
        int b1 = 6;
        int c1;
        /*
        if(a1>b1){
            c1 = a1 - b1;
        }else {
            c1 = b1 - a1;
        }
        System.out.println(c1);
         */
        /*
        Methods obj1 = new Methods;
        c1 = obj1.logic(a1,b1);

         */
        c1 = logic(a1,b1);
        System.out.println(c1);

    }
}
