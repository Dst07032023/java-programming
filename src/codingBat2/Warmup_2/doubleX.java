package codingBat2.Warmup_2;

/**
 * Given a string, return true if the first instance of "x"
 * in the string is immediately followed by another "x".
 * <p>
 * <p>
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false3622
 * doubleX("xxxxx") → true
 */

public class doubleX {
    public static void main(String[] args) {

    }

    boolean doubleX(String str) {
        int ind = str.indexOf('x');
        if (ind != str.length() - 1) {

        if (str.length() > 1 && str.charAt(ind + 1) == 'x') {
            return true;
        }
        }
        return false;
    }
}
