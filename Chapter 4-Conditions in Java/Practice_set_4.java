import java.util.Scanner;
public class Practice_set_4 {
    public static void main(String[] args) {
        //------------------> Practice Set 4 <-----------------------
        //1)
//        int a = 10;
//        if (a == 11){
//            System.out.println("I am 11.");
//        }
//        else{
//            System.out.println("I am 10");
//        }

        //2)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 1st subject mark: ");
//        int a = sc.nextInt();
//        System.out.print("Enter 2nd subject mark: ");
//        int b = sc.nextInt();
//        System.out.print("Enter 3rd subject mark: ");
//        int c = sc.nextInt();
//
//        double result = ((a+b+c)/300.0)*100;
//        if (result >= 90){
//            System.out.printf("Your percentage is %.2f.\nPerformance --> Excellent",result);
//        } else if (result < 90 && result >= 80) {
//            System.out.printf("Your percentage is %.2f.\nPerformance --> Good",result);
//        } else if (result < 80 && result >= 40) {
//            System.out.printf("Your percentage is %.2f.\nPerformance --> Perfect",result);
//        } else if (result < 40 && result >= 33) {
//            System.out.printf("Your percentage is %.2f.\nPerformance --> Average",result);
//        }else {
//            System.out.printf("Your percentage is %.2f.\nPerformance --> Fail",result);
//        }


         //3)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your Amount of Salary: ");
//        double input = sc.nextDouble();
//        if (input < 250000){
//            System.out.printf("Your salary : %.2f.\nTax : 0",input);
//        } else if (input >= 250000 && input < 500000) {
//            System.out.printf("Your salary : %.2f.\nTax : 5",input);
//        } else if (input >= 500000 && input < 1000000) {
//            System.out.printf("Your salary : %.2f.\nTax : 20",input);
//        } else {
//            System.out.printf("Your salary : %.2f.\nTax : 30",input);
//        }

        //4)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Day: ");
//        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Please enter valid day.");
//
//        }

        //5)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int a = sc.nextInt();
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
            System.out.print(a + " is a leap year.");
        }else {
            System.out.print(a + " is not a leap year.");
        }


        //6)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the website: ");
//        String website = sc.nextLine();
//        if (website.endsWith(".com")){
//            System.out.println("Commercial Website.");
//        } else if (website.endsWith(".in")) {
//            System.out.println("Indian Website.");
//
//        } else if (website.endsWith(".org")) {
//            System.out.println("Organisation Website.");
//        }else {
//            System.out.println("Please enter valid Website.");
//        }
    }
}
