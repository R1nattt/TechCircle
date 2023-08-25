package week3Tasks;

import java.util.Scanner;

public class InitialsPractice {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("please enter your full name");
        name = input.nextLine();

        char firstInitial = name.charAt(0);
        int spaceIndex = name.indexOf(" ");
        char lastInitial = name.charAt(spaceIndex+1);

        System.out.println((firstInitial+"."+lastInitial).toUpperCase());

    }
}
