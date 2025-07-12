public class Practice_set_3 {
    public static void main(String[] args) {
        //Practice Set----->3
        String a = "Gojo Saturo";

        //1)
        System.out.println(a.toLowerCase());

        //2)
        System.out.println(a.replace(' ','_'));

        //3)
        String letter = "Dear <|name|>, Thanks a lot.";
        System.out.println(letter.replace("<|name|>","Gojo Sir"));

        //4)
        System.out.println(a.indexOf(" "));
        System.out.println(a.indexOf("  "));

        //5)
        String b = "Dear Gojo, \n\t\tThanks for Jujutsu Kaisen.";
        System.out.println(b);
    }
}
