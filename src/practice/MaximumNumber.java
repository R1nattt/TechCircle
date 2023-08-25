package practice;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int max = 0;

        Scanner keyboard = new Scanner(System.in);



        for (int i = 0; i <5; i++) {
            System.out.println("Enter a number");
            int input = keyboard.nextInt();

            if(input > max){
                max = input;
            }
        }

        System.out.println(max);


    }
}

  /*
   int max = 0;
        int a = 3;
        int b = 9;
        int c = 4;

   if(a > max){
            max = a;
        }

        System.out.println(max);

        if(b > max){
            max = b;
        }
        System.out.println(max);

        if(c > max){
            max = b;
        }
        System.out.println(max);


    } */

