package day13_nestedLoops;

public class Count1To10FiveTimes {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }


        // can i use anything in the loop instead of using "i"
        for (int iteration =1; iteration < 6; iteration++) { //outer loop : will run one iteration

            System.out.println(iteration);
            System.out.println("Hello");

            if (iteration == 3) {
                break;
            }
            for (int i = 1; i <= 10; i++) { // inner loop: will run full iteration
                System.out.println(i);
            }

            int rowCount = 6;
            int columnCount = 3;

            for (int row = 1; row <= rowCount; row++) {
                System.out.println("reading row# " + row);

                for (int column = 1; column <= rowCount; column++) {
                    System.out.println("Reading column# " + column);

                }
            }
        }
    }
}
