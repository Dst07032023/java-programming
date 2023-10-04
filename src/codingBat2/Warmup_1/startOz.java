package codingBat2.Warmup_1;

/**
 * Given a string, return a string made of the first 2 chars
 * (if present), however include first char only if it is 'o'
 * and include the second only if it is 'z', so "ozymandias" yields "oz".
 *
 *
 * startOz("ozymandias") → "oz"
 * startOz("bzoo") → "z"
 * startOz("oxx") → "o"
 */

public class startOz {
    public static void main(String[] args) {

    }
    public String startOz(String str) {
        String rez = "";
        if(str.length() >= 2 && str.substring(0,2).contains("oz")){
            return str.substring(0,2);
        }
        if(str.length() >= 1 && str.charAt(0) == 'o'){
            return rez + str.charAt(0);
        }else if(str.length() >= 2 && str.charAt(1) == 'z'){
            return rez + str.charAt(1);

        }
        return "";

    }
}
