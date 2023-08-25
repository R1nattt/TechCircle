package day16_4thReview;

public class NestedLoopReview {
    public static void main(String[]args){
        int i = 0;
        int j = 0;
        while(i < 3){
            i++;
            j = 0;
            while (j < 3 ){
                j++;
                System.out.println("Hello World");
            }
        }
    }
}
//Nested loop is loop inside a loop.
//Nested loop is mainly used for table, get value from table, create table.