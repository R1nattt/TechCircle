package day16_4thReview;

public class StringReview {
    public static void main(String[] args) {
        String myStr = "hello world";
        //index of returns index number of the character
        System.out.println(myStr.indexOf("o"));
        System.out.println(myStr.indexOf("o",5));
        System.out.println(myStr.indexOf("world"));
        System.out.println(myStr.indexOf("x")); // if result is (-1), means myStr does not contain character x

        //startWith() / endWith() -> only returns boolean
        System.out.println(myStr.startsWith("hell"));
        // isBlank() / isEmpty() : .length() ==0
        System.out.println("".isEmpty());  //true
        System.out.println("".isBlank());   //true
        System.out.println("\n\t\r".isBlank()); //true
        System.out.println("\n\t\r".isEmpty()); //empty

        //.contains(): returns boolean

        System.out.println(myStr.contains("xs"));

        //replace

        System.out.println(myStr.replace("o","!"));
        System.out.println(myStr.replace("o","")); //remove 'o
        System.out.println(myStr.replaceFirst("o",""));


        //subString : to get partial word of the string
        System.out.println(myStr.substring(0,5));
        System.out.println(myStr.substring(6));
        System.out.println(myStr.substring(0,myStr.indexOf(" ")));
        System.out.println(myStr.substring(myStr.indexOf(" ")+1));

        System.out.println(String.join("---","a","v","c"));








    }
}
