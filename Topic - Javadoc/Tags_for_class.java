/**
 * This is the page where i learn how to add jovadoc tags for classes in programs.
 * <p><i>This is italic</i></p>
 * @author Adarsh (Code with adarsh)
 * @version 0.5
 * @since 2004
 * @see <a href="https://docs.oracle.com/en/java/javase/24/docs/api/index.html" target="_blank">Java Docs</a>
 */
public class Tags_for_class {
    static void add(int a,int b){
        int c = a+b;
        System.out.printf("The sum of %d and %d is : %d",a,b,c);
    }
    public static void main(String[] args) {
        add(5,5);
    }
}

