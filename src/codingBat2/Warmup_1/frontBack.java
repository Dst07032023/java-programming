package codingBat2.Warmup_1;

/**
 * Given a string, return a new string where the
 * first and last chars have been exchanged.
 *
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

public class frontBack {
    public static void main(String[] args) {

    }
    public String frontBack(String str) {
        if(str.length()<=1){
            return str;
        }
        String midle = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + midle + str.charAt(0);
    }
}
