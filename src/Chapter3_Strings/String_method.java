package Chapter3_Strings;

public class String_method {
    public static void main(String[] args) {
        String a = "Adarsh";
        //length Method
        int value = a.length();
        System.out.printf("Length of string %s is: %d%n",a,value);
        //System.out.print("Length of string "+a+" is: "+value);--->Same output

        //Lower and Upper Case Method
        String b = a.toLowerCase();
        System.out.println("Lower Case Form: "+b);
        String c = a.toUpperCase();
        System.out.println("Upper Case Form: "+c);

        //Trim Method
        String d = "    Adarsh    ";
        System.out.println("Non-Trimed string: "+d); //non trimed string
        String e = d.trim();
        System.out.println("Trimed string: "+e);


        //Substring Method
        System.out.println(a.substring(3));
        System.out.println(a.substring(1,6));

        //Replace Method
        System.out.println(a.replace('r','m'));
        System.out.println(a.replace("Adarsh","Bhagyashree"));

        //Startswith Method
        System.out.println(a.startsWith("Ad"));

        //Endswith method
        System.out.println(a.endsWith("rh"));

        //charAt Method
        System.out.println(a.charAt(2));

        //indexOf Method
        System.out.println(a.indexOf('r')); //3
        System.out.println(a.indexOf('m')); //-1
        System.out.println(a.indexOf("h",1));

        //Equals Method
        System.out.println(a.equals("AdarsH"));
        /*
        equals() vs ==
Ye interview ka favourite question hai.
String s1="Java";
String s2="Java";
System.out.println(s1==s2);
Output
true
Kyuki dono String Pool ke same object ko refer kar rahe hain.

String s3=new String("Java");
String s4=new String("Java");
System.out.println(s3==s4);
Output
false
Dono alag objects hain.
Lekin
System.out.println(s3.equals(s4));
Output
true
Kyuki equals() content compare karta hai.
Ek line me yaad rakho:
== → Reference (memory address) compare karta hai.
equals() → Actual String content compare karta hai.
         */

        //EqualIgnoreCase Method
        System.out.println(a.equalsIgnoreCase("adarsh"));
        System.out.println(a.equalsIgnoreCase("Adarsg"));

        //contains() method
        //Ye check karta hai ki String ke andar diya hua text present hai ya nahi.
        System.out.println(a.contains("dars")); //true

        //split() method return type -> array
        String str = "QA Automation Tester";
        String[] arr = str.split(" ");
        for(String word:arr){
            System.out.println(word);
        }
    }
}
