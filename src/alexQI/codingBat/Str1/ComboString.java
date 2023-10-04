package alexQI.codingBat.Str1;

public class ComboString {
    public static void main(String[] args) {
        /**
         *
         Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
         on the outside and the longer string on the inside. The strings will not be the same length,
         but they may be empty (length 0).
         comboString("Hello", "hi") → "hiHellohi"
         comboString("hi", "Hello") → "hiHellohi"
         comboString("aaa", "b") → "baaab"
         */
        String a = "Hello";
        String b = "Hihhhhhhhh";
        if(a.length() < b.length()) {
            System.out.println(a + b + a);
        }else{
            System.out.println(b+a+b);
        }
    }
}
