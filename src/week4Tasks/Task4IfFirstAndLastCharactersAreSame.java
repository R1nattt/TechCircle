package week4Tasks;

import java.util.Scanner;

public class Task4IfFirstAndLastCharactersAreSame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str;

        System.out.println("Enter a word");
        str = input.next();
        String first = ""+str.charAt(0);
        String last = ""+str.charAt(str.length()-1);

        if(first.equalsIgnoreCase(last)){
            System.out.println("First and Last characters are the same");
        }else{
            System.out.println("First and Last characters are not the same");
        }
    }
}
