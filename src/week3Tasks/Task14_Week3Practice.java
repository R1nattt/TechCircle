package week3Tasks;

public class Task14_Week3Practice {
    public static void main(String[] args) {

    String space = " ";
        for (int i = 1; i <= 4; i++) {
            for (int j = 3-i; j >=0 ; j--) {
                System.out.print(space);
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
 size of each row is increment by 2
        1
       222
      33333
     4444444
 */