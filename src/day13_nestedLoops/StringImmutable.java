package day13_nestedLoops;
// what does immutable mean
public class StringImmutable {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = " techcircle";
        String str3 = str+str2;
        String str4 = "Hello techCirlce";


        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str3==str4);

        System.out.println(str.toUpperCase());
        System.out.println(str);




    }
}
