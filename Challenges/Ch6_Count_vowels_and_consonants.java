import java.util.*;

public class Ch6_Count_vowels_and_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0;
        for (char c:str.toCharArray()){
            if ("aeiouAEIOU".indexOf(c) != -1){
                vowels ++;
            } else if (Character.isLetter(c)) {
                consonants ++;
            }
        }
        System.out.println("Vowels: "+vowels+" "+"Consonants: "+consonants);
    }
}