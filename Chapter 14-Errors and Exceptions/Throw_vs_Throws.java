class negative extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative by string.";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative by msg.";
    }
}
public class Throw_vs_Throws {
    public static double area(int r) throws negative {
        if(r<0){
            throw new negative();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int sum(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println("The result of 5/0 is : "+sum(5,0));
        }catch (Exception e){
            System.out.println("Error occurred.");
            System.out.println(e);
        }

        double r = 0;
        try {
            r = area(7);
        } catch (negative e) {
            throw new RuntimeException(e);
        }
        System.out.println("The area of circle of radius 7 is : "+r);

    }
}

