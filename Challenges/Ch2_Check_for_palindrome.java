public class Ch2_Check_for_palindrome {
    public static void main(String[] args) {
        String a = "Mango";
        String b = "Radar";
        String c = "121";
        String reversed_a = new StringBuilder(a).reverse().toString();
        String reversed_b = new StringBuilder(b).reverse().toString();
        String reversed_c = new StringBuilder(c).reverse().toString();
        System.out.printf("Is %s palindrome: "+a.equalsIgnoreCase(reversed_a),a);
        System.out.printf("\nIs %s palindrome: "+b.equalsIgnoreCase(reversed_b),b);
        System.out.printf("\nIs %s palindrome: "+c.equalsIgnoreCase(reversed_c),c);
    }
}