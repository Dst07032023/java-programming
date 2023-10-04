package alexQI.codingBat.Str1;

        /*
        Given two strings, append them together (known as "concatenation") and return the result.
         However, if the strings are different lengths, omit chars from the longer string,
          so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
          The strings may be any length.
        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"
        */

public class MinCat {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hilllloooo";
        int n = a.length();
        int n1 = b.length();
        System.out.println(minCat("Hello", "Hi"));
//        if (a.length() > b.length()) {
//            System.out.println(a.substring(n) + b);
//        } else if (a.length() < b.length()) {
//            System.out.println(a + b.substring(n1));
//        } else {
//            System.out.println(a + b);
//
//        }
    }

    public static String minCat(String a, String b) {
        String result = "";

        if (a.length() > b.length()) {
            result += a.substring(a.length() - b.length()) + b;
        } else if (b.length() > a.length()) {
            result += a + b.substring(b.length() - a.length());
        }
            return result;
    }
}
