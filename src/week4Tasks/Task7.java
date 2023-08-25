package week4Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String str;
        String last3Character = "";

        System.out.println("Please Enter a String");
        str = input.nextLine();

        if(str.length()==0){
            System.out.println("Empty String");
        }else if(str.length()>3){
            for (int i = str.length()-3; i<=str.length()-1 ; i++) {
               last3Character +=""+str.charAt(i);
            }
            System.out.println(last3Character);
        }else{
            System.out.println(str);
        }
    }
}
