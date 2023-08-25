package week4Tasks;

import java.util.Scanner;

public class Task6Initials {
    public static void main(String[] args) {  //write a program that can return the initials of the user

        Scanner input = new Scanner(System.in);
        String name;


        System.out.println("Please enter your full name:");
        name = input.nextLine();
        int spacesPosition = name.indexOf(" ");

        String firstName = name.substring(0, spacesPosition);
        String lastName = name.substring(spacesPosition + 1);

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println(firstInitial+"."+lastInitial);


    }

}