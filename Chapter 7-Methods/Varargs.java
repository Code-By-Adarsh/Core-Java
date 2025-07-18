public class Varargs {
    /*
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b,int c){
        return a + b + c;
    }
    static int sum(int a, int b,int c,int d){
        return a + b + c + d;
    }
     */
    static int sum(int ... arr){
        //available as int [] arr;
        int result = 0;
        for (int a:arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 5 and 5 is: "+sum(5,5));
        System.out.println("The sum of 5,5 and 5 is: "+sum(5,5,5));
        System.out.println("The sum of 5,5,5 and 5 is: "+sum(5,5,5,5));
    }
}
