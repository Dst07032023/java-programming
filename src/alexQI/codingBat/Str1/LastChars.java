package alexQI.codingBat.Str1;

public class LastChars {
    public static void main(String[] args) {
        /**
         * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
         * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
         * lastChars("last", "chars") → "ls"
         * lastChars("yo", "java") → "ya"
         * lastChars("hi", "") → "h@"
         */
    }

    public static String lastChars(String a, String b) {
        String result = "";
        if (a.length() < 1 && b.length() < 1) {
            result += "@" + "@";
        } else if (a.length() < 1) {
            result += "@" + b.charAt(b.length() - 1);
        } else if (b.length() < 1) {
            result += a.charAt(0) + "@";
        } else {
            result += "" + a.charAt(0) + b.charAt(b.length() - 1);
        }
        return result;
    }
}
