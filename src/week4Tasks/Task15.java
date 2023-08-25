package week4Tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[]args){
        String str = "ab123c4d56efg";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isDigit(each)){
                System.out.print(each);
            }
        }
    }
}
/*
Write a program to extract digits from a String:

```text
input:
ab123c4d56efg

output:
123456
 */