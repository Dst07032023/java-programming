package codingBat2.Warmup_2;

/**
 * Given a string and a non-negative int n,
 * return a larger string that is n copies of the original string.
 *
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */

public class stringTimes {
    public static void main(String[] args) {
        stringTimes("Hi", 2);
        System.out.println(stringTimes("hi",  5));

    }
    public static String stringTimes(String str, int n) {
        String rez = "";

        for(int i = 0; i < n; i++){
            rez = rez + str;
        }
        return rez;
    }
}
