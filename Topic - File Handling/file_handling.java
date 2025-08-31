import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        //--------------->To create a file:
        /*
        File myFile = new File("Practice.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file.");
            e.printStackTrace();
        }


        //--------------->To write in file:
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Practice.txt");
            fileWriter.write("This is our first file written by java.\nOk now bye.");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //--------------->To read a file:
        File myfile = new File("Practice.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */

        //------------>To delete in file:
        File myfile = new File("Practice.txt");
        if (myfile.delete()){
            System.out.println("Successfully deleted file : "+myfile.getName());
        }else {
            System.out.println("Some error occured.");
        }

    }
}