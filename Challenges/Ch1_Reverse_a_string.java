public class Ch1_Reverse_a_string {
    public static void main(String[] args) {
        String a = "Adarsh";
        //1st way:
        StringBuilder reversed_a = new StringBuilder(a).reverse();
        //2nd way:
        //String reversed_a = new StringBuilder(a).reverse().toString();
        System.out.printf("By StringBuilder reverse of %s : %s",a,reversed_a);

        //3rd way(using loop):
        String reversed_a1 = "";
        for (int i=a.length()-1; i>=0; i--){
            reversed_a1 = reversed_a1+ a.charAt(i);
        }
        System.out.printf("\nBy for loop reverse of %s : %s",a,reversed_a1);
    }
}