package week4Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord;
        String secondWord;

        System.out.println("Enter a word");
        firstWord = input.nextLine();
        System.out.println("Enter a anotherWord");
        secondWord = input.nextLine();

        if(firstWord.length()>secondWord.length()){
            System.out.println(firstWord);
        }else if(secondWord.length()>firstWord.length()) {
            System.out.println(secondWord);
        }
        else {
            System.out.println("Both words has same number of characters");
        }

    }
}
