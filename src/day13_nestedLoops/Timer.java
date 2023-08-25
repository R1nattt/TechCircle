package day13_nestedLoops;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        int time = 15;

        for(int minute =time -1; minute >=0; minute--) {
            //System.out.println(minute);

            for (int seconds = 59; seconds >=0; seconds--){
                System.out.println(minute+":"+seconds);
                Thread.sleep(1000);
            }

        }

    }



}
