package day16_4thReview;

public class StringStaticMethod {
    public static void main(String[] args) {
        //.format()
        //%s, - String
        //%S, - String to uppercase
        //%d, - whole number, byte -> long
        //%f, - float, double
        //%b, - boolean

        String myStr = "none";
        int carMakeYear = 2022;
        String formattedStr = String.format("my name is %s I am %d years old.","Rinat", 25);
        System.out.println(formattedStr);

    }
}
