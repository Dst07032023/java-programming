package codingBat2.Warmup_1;

/**
 * Given a string, take the last char and
 * return a new string with the last char
 * added at the front and back, so "cat" yields
 * "tcatt". The original string will be length 1 or more.
 *
 *
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
 */

public class backAround {
    public static void main(String[] args) {

    }
    public String backAround(String str) {
        if(str.length()<=1){
            return str+str+str;
        }
        String word = str.substring(str.length()-1);
        return word+str+word;
    }
}
