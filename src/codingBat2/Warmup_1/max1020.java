package codingBat2.Warmup_1;

/**
 * Given 2 positive int values, return the larger value that
 * is in the range 10..20 inclusive, or return 0 if neither is in that range.
 *
 *
 * max1020(11, 19) → 19
 * max1020(19, 11) → 19
 * max1020(11, 9) → 11
 */

public class max1020 {
    public static void main(String[] args) {

    }
    public int max1020(int a, int b) {
        int temp1 = 0;
        int temp2 = 0;

        if(a >= 10 && a <= 20){
            temp1 = a;
        }else{
            temp1 = 0;
        }
        if(b >= 10 && b <= 20){
            temp2 = b;
        }
        return Math.max(temp1,temp2);
    }
}
