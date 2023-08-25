package day16_4thReview;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        String fullName = "tom hank";
        char firstInitial = fullName.charAt(0);
        int spaceIndex = fullName.indexOf(" ");
        char secondLetter = fullName.charAt(spaceIndex+1);
        String initials = (firstInitial+"."+secondLetter).toUpperCase();
        System.out.println(initials);

    }
}
