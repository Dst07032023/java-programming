package codingBat2.Warmup_2;

/**
 * Given a string and a non-negative int n,
 * we'll say that the front of the string is the
 * first 3 chars, or whatever is there if the string
 * is less than length 3. Return n copies of the front;
 *
 *
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class frontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));

    }
    public static String frontTimes(String str, int n) {
        int front = 3;
        if(front > str.length()){
            front = str.length();
        }
        String front1 = str.substring(0,front);
        String rez = "";
        for(int i = 0; i < n; i++){
            rez = rez + front1;
        }
        return rez;
    }
}
