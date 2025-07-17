public class Methods_overloading {
    static void hoo(){
        System.out.println("Good morning bro!");
    }
    static void hoo(int a){
        System.out.println("Good morning "+a+" bro!");
    }
    static int change(int a){
        a = 0;
        return a;
    }
    static void change2(int [] arr){
        arr[0] = 0;
    }
    static void telljoke(){
        System.out.println("Hi, I am Adarsh.");
    }
    public static void main(String[] args) {
        //telljoke();
        // ---------> Changing the integer:

        int [] marks = {6,7,3,9,10};
        int x = marks[0];
        //change(x);
        //System.out.println("The value of x after not changing will be : "+x);
        int d = change(x);
        System.out.println("The value of x after changing will be : "+ d);


/*
        int [] marks = {6,7,3,9,10};
        change2(marks);
        System.out.println("The value of 6 after changing will be : "+marks[0]);

 */

        //Method Overloading:
        hoo();
        hoo(65052);
        //Arguments are actual as well as Truth but parameter are references as well as dummy.

    }
}
