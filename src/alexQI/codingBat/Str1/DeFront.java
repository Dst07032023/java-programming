package alexQI.codingBat.Str1;

public class DeFront {
    public static void main(String[] args) {
        /*
        Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
        and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"
         */
        String str = "abllo";
        System.out.println(deFront(str));
    }
    public static String deFront(String str) {
        if(str.substring(0,2).equals("ab")) {
            return str;
        }else if(str.charAt(0) == ('a')) {
            return str.charAt(0) + str.substring(2);
        } else if (str.charAt(1) == ('b')) {
            return str.charAt(1) + str.substring(2);
        }else{
            return str.substring(2);
        }
    }
}
