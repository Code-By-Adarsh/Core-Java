public class Introduction{
    public static void main(String[] args) {
        /*Classroom of 500 student --> You have to store their marks.
        You have two choices:
        1)Make 500 variables and then store
        2)Using array (recommended)
        */

        /* 1st way:
        int [] marks;   ---->Decleration
        marks = new int [5]; ---->Allocation
        */

        /* 2nd way:
        int [] marks = {56,45,68,70,34}; --->Decleration and allocation + initilization
        */

        //3rd way:
        int [] marks = new int [5]; //Decleration and allocation
        marks [0] = 56;
        marks [1] = 66;
        marks [2] = 46;
        marks [3] = 26;
        marks [4] = 86;
        marks [4] = 90; // can be overwrite
        System.out.println(marks[4]);
    }

}
