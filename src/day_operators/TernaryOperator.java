package day_operators;

public class TernaryOperator {
    public static void main(String[] args) {


        //Syntax:
            // condition ? true block : false block;

        int a, b;

        a = 10;

        b = ( a == 1) ? 20: 30;

        System.out.println(b);

        b = (a >= 10 ) ? 50: 100;

        System.out.println(b);


        int num = 5;

        System.out.println(num % 2);

        String evenOrOdd = ( num%2 == 0) ? "even" : "odd";

        System.out.println(evenOrOdd);

        evenOrOdd = ( num%2 == 1) ? "odd" : "even";

        System.out.println(evenOrOdd);



    }
}
