package alexQI.codingBat.Str1;

public class NTwice {
    public static void main(String[] args) {
        /*

        Given a string and an int n, return a string made of the first and last n chars from the string.
    The string length will be at least n.
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
         */

        String str = "Hello";
        System.out.println(nTwice(str,2));

    }

    public static String nTwice(String str, int n) {
    String first =  str.substring(0, n);
    String second =  str.substring(str.length() - n);


        return first+second;
    }
}
