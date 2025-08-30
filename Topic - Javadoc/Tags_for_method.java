class sum{
    public int add(int a,int b){
        return a+b;
    }
}
public class Tags_for_method {
    /**
     *
     * @param args "This is page where i learn java docs tags for methods.
     */
    public static void main(String[] args) {
        System.out.println("I am a main method.");
        sum m = new sum();
        System.out.println(m.add(5,5));
    }

    /**
     * This is the method that is very beautiful.
     * @param a This is the first number to add.
     * @param b This is the second number to add.
     * @return This is the place where we see result.
     * @throws Exception If a is equal to 0.
     * @deprecated This method is depreceted from my plan.
     */
    public int add(int a,int b) throws Exception{
        if (a==0){
            throw new Exception();
        }
        return a+b;
    }
}

