public class Break_continue {
    public static void main(String[] args) {
        //Break and Continuous using loops
        for (int i=1; i<=10; i++) {
            if (i == 2) {
                System.out.println("Ha ha i am joking.");
                continue;
            } else if (i == 7) {
                System.out.println("Ending the loop.");
                break;
            }
            System.out.println(i + " Java is great.");
        }
        //Best example for understanding continue:
//        int i = 1;
//        while (i<5){
//            System.out.println(i);
//            if (i==2){
//                System.out.println("bhago");
//                continue;
//            }
//            i++;  //Infinite loop
//        }
    }
}
