import java.util.*;

public class Ch3_Fibonacci_Series {
    public static void main(String[] args) {
        //Fibonacci Series: 0 1 1 2 3 5 8 13 21
        ArrayList<Integer> answer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter length of series of Fibonacci: ");
            int user = sc.nextInt();
            if (user==1 || user==2){
                for (int i=1; i<=user; i++){
                    answer.add(i-1);
                }
                System.out.printf("Fibonacci Series upto %d term: "+answer,user);
                break;
            } else if (user==0) {
                System.out.println("Please enter term value greater than 0.");
            } else {
                answer.add(0);
                answer.add(1);
                int i=2;
                while (i<=user-1){
                    answer.add(answer.get(i-1)+answer.get(i-2));
                    i++;
                }
                System.out.printf("Fibonacci Series upto %d term: "+answer,user);
                break;
            }
        }
        sc.close();
        System.out.println("\n-------------------Bookish Solution----------------------------");
        int n = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: " + num1 + ", " + num2);
        for (int i = 2; i < n; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}