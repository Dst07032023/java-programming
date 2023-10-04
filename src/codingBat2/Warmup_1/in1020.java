package codingBat2.Warmup_1;

/**
 * Given 2 int values, return true if either of them is in the range
 * 10..20 inclusive.
 *
 *
 * in1020(12, 99) → true
 * in1020(21, 12) → true
 * in1020(8, 99) → false
 */

public class in1020 {
    public static void main(String[] args) {

    }
    public boolean in1020(int a, int b) {
        return a >= 10 && a <= 20 || b <= 20 && b >= 10;
    }
}
