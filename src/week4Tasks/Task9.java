package week4Tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Please enter your full name");
        name = input.nextLine();
        String[] ArrayNames = name.split(" ");

        for (int i = 0; i < ArrayNames.length-1; i++) {
            System.out.println(ArrayNames[i]);

        }
        System.out.println(ArrayNames[ArrayNames.length-1]);
    }
}
/*
Finding initials

Output:
ppleanana
 */