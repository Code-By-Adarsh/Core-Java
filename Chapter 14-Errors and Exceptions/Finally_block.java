public class Finally_block {
    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("The end of this program.");
        }
        return -1;

    }
    public static void main(String[] args) {
        //Finally block contains the code which is always executed whether the exception is handled or not.
        int k = greet();
        System.out.println(k);

        int x = 4;
        int y = 4;
        while(true){
            try{
                System.out.printf("The value of %d/%d is : "+x/y,x,y);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Yes this is final.");
            }
            y--;
        }
    }

}

