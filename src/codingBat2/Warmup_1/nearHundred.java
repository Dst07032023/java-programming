package codingBat2.Warmup_1;

/**
 *
 Given an int n, return true if it is within 10 of 100
 or 200. Note: Math.abs(num) computes the absolute
 value of a number.

 nearHundred(93) → true
 nearHundred(90) → true
 nearHundred(89) → false
 */

public class nearHundred {
    public static void main(String[] args) {

    }
    public boolean nearHundred(int n) {
        return (Math.abs(100-n) <= 10) || (Math.abs(200-n) <=10);
    }

}
