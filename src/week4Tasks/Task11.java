package week4Tasks;

import java.awt.*;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;

        System.out.println("Enter a word");
        str = input.nextLine();
        if(str.startsWith("x")){
            System.out.println(str.substring(1,str.length()-1));
        }else{
            System.out.println("the word does not start with x");
        }
    }
}
/*
Ask user to enter a word. If the work starts with x, print the word without x.

```text
Input:
xcode

Output:
code
```
 */