import java.util.Scanner;
public class Practice_set_6 {
    public static void main(String[] args) {
        //Practice set - 6:
        //1)
        /*
        float[] num = {11.0f, 12.3f, 23.0f, 10.0f, 3.2f};
        float sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum: "+sum);
*/
        //2)
        /*
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        //using while loop:

        int i = 0;
        boolean found = false;
        while (i<num.length) {
            if (input == num[i]) {
                found = true;
                break;
            }
            i++;
        }
            if(found){
                System.out.printf("The number is %d is present in array.",input);
            }else {
                System.out.printf("The number is %d is not present in array.",input);
            }*/

        //using for loop:
        /*
        boolean found = false;
        for (int i=0; i<num.length; i++) {
            if (input == num[i]) {
                found = true;
                break;
            }
        }
            if (found){
                System.out.printf("The number is %d present in array.",input);
            }else {
                System.out.printf("The number is %d not present in array.",input);
            }

         */

        //3)
        /*
        int [] marks = {45,67,45,67,78,35,39};
        int sum = 0;
        for(int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        double avg = (double) sum/marks.length;
        System.out.printf("The average marks of physics is: %.2f",avg);
*/

        //4)
        /*
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{3,2,1},
                         {6,5,4}};
        int [][] result = {{0,0,0},
                          {0,0,0}};
        for (int i=0; i<mat1.length; i++){   //row number of times
            for (int j=0; j<mat1[i].length; j++){ // column number of time
                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0; i<mat1.length; i++){   //row number of times
            for (int j=0; j<mat1[i].length; j++){ // column number of time
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("");
*/

        //5)
        /*
        int [] num = {1,2,3,4,5,6,7,8,9,10};
        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }

         */


        //6)
        /*
        int [] num = {102,21,37,49,52,66,70,80,91,110};
        int max = Integer.MIN_VALUE;  //0
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
            }

        }System.out.printf("The maximum number in array is: %d",max);

         */

        /*
        for (int element:num){
            if(element>max){
                max=element;
            }
        }
        System.out.printf("The maximum number in array is: %d",max);

         */

        //7)
        /*
        int [] num = {102,21,37,49,52,66,70,80,91,110};
        int min = Integer.MIN_VALUE;  //110
        for(int e:num){
            if(min>e){
                min=e;
            }
        }System.out.printf("The minimum number in array is: %d",min);
         */

        //8)
        /*
        int [] arr = {1,21,34,20,776,13};
        boolean found = false;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>arr[i+1]){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("The array is not sorted.");
        }else {
            System.out.println("The array is sorted.");
        }

         */


    }
}
