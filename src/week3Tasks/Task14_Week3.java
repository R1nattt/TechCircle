package week3Tasks;

public class Task14_Week3 {
    public static void main(String[]args){
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) { // j loop will always getting smaller
                System.out.print(i); //digit in the same line
            }
            System.out.println(); //enter new line
        }
    }
}
/*
Write a program that generates the following pattern using nested for loops:
 55555
 4444
 333
 22
 1
 */
