package alexQI.codingBat.Str1;

public class WithoutEnd2 {
    public static void main(String[] args) {
        /**
         * Given a string, return a version without both the first and last char of the string.
         * The string may be any length, including 0.
         * withouEnd2("Hello") → "ell"
         * withouEnd2("abc") → "b"
         * withouEnd2("ab") → ""
         */
        String str = "a";
        if(str.length() <= 1) {
            System.out.println("");
        }else{
        System.out.println(str.substring(1, str.length()-1));
    }
     }
}
