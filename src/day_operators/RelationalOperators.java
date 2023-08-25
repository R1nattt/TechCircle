package day_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // ==, >, >=, <, <=, !=
        // RelationalOperators will return boolean

        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println(a==b);

        int d = a+b;

        System.out.println(d==c);

        boolean result = a + b == c;

        System.out.println(result);


        a = 1;
        b = 2;
        c = 3;


        System.out.println(a>=b);

        System.out.println(a+b >=c);

        boolean result2 = a <=c;

        System.out.println(result2);

        System.out.println(a*b >= c);



    }
}
