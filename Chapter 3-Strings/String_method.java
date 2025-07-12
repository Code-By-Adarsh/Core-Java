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
        System.out.println(a.indexOf('r'));
        System.out.println(a.indexOf("d",1));

        //Equals Method
        System.out.println(a.equals("Adarsh"));

        //EqualIgnoreCase Method
        System.out.println(a.equalsIgnoreCase("adarsh"));
        System.out.println(a.equalsIgnoreCase("Adarsg"));


    }
}
