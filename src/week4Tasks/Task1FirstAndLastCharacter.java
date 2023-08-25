package week4Tasks;

import java.util.Scanner;

public class Task1FirstAndLastCharacter {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String sentence;

        System.out.println("Please enter a sentence");
        sentence = input.nextLine();

        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);

        System.out.println("The first and last characters of the sentence you have entered are: " +
                (first+"."+last).toUpperCase());

    }
}



/* `write a program that asks user to enter a sentence. then print the first & last characters of the sentence
Example:
`
Input: Welcome To TechCircle
output: We
## Task2
 */