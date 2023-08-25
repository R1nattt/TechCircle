package week4Tasks;

import java.util.Scanner;

public class Task2ReverserAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = "";
        String reversedStr = "";

        System.out.println("Please enter a word");
        word = input.nextLine();

        if(word.length()==5){
            for (int i = word.length()-1; i >= 0 ; i--) {
                char each = word.charAt(i);
                reversedStr+=each;
            }
            System.out.println(reversedStr);
        }
        else if(word.length()>5){
            System.out.println("Too long");
        }else{
            System.out.println("Too short");
        }
    }
}





