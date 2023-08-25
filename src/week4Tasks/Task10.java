package week4Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Please enter a word");
        word = input.nextLine();

        if(word.endsWith("ly")||word.endsWith("LY")){
            System.out.println("Really?");
        }else{
            System.out.println("Never mind");
        }
    }
}
/*
## Task10
Ask the user to enter a word. if the word ends with "ly", print "really???" , otherwise, print "
never mind"
 */
