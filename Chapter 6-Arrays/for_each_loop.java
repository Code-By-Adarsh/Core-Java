public class for_each_loop {
    public static void main(String[] args) {
        // float[] marks = {56.6f, 67.8f, 56.0f, 56.7f, 67.5f};
        // String [] student = {"Rohit","Pritam","Ayush","Shivam"};
        //System.out.println(student.length);

        //length method:
        int [] marks ={26,67,87,56,46};
        System.out.println(marks.length);
        System.out.println(marks[3]);

        //Displaying all marks using for loop:
        System.out.println("In right order:");
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("In reverse order:");
        for (int y=marks.length-1; y>=0; y--){
            System.out.println(marks[y]);
        }

        //using for-each loop:
        System.out.println("Using for each loop:");
        for (int element:marks){
            System.out.println(element);
        }

    }
}
