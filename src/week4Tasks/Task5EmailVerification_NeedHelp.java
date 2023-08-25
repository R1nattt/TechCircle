package week4Tasks;

import java.util.Scanner;

public class Task5EmailVerification_NeedHelp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email;
        boolean valid;

       System.out.println("please enter your email address");
       email = input.nextLine();

       int indexDot = '.';
       int indexAt = '@';






    }

}

//Your team has created a new bank website that requires email address to be validated. The email
//string must contain an '@' character. The email string must contain an '.' character. The '@' must
//contain at least one character in front of it. e.g. "a@example.com" is valid while "@example.com" is
//invalid. The '.' and '@' must be in the appropriate places. e.g. "mike.smith@com" is invalid while "
//mike.smith@example.com" is valid. For a given string, find a solution that writes true on the
//console if an email is valid and false if it is invalid.
//
//Examples:
//str = "test@example.com" --> true str = "test@example.co.in --> true str = "@example.com" --> false
