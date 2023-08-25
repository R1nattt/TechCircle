package week4Tasks;

public class Task16 {
    public static void main(String[] args) {

        String str = "abcabcabcabc";
        String result = "";
        for (int i = 0; i <= str.length()-1; i++) {
            String each =""+str.charAt(i);

            if(result.contains(each)){
                continue;
            }else {
                result+=each;
            }
        }
        System.out.println(result);

    }
}
/*
Write a program to extract distinct character from a string input: abcabcabcabc output:abc
 */
