package week4Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("Please enter a word");
        word = input.nextLine();
        String second = ""+word.charAt(1);

        if(word.length()==3){
               if(second.equalsIgnoreCase("a")){
                   System.out.println("Cool word");
            }else{
                   System.out.println("Okay word");
               }
        }
        else if(word.length()>3){
            System.out.println("The word you have entered is too long");
        }else {
            System.out.println("Word you have entered is too short");
        }
    }
}
/*
middle letter is not 'a' print: "Okay word". - If the user does not enter a 3 letter word tell them:
If the word is less than 3 letters: "Word is too short"
If the word is too long: "Word is too long"
*/