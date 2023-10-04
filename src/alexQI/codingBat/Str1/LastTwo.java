package alexQI.codingBat.Str1;

public class LastTwo {
    public static void main(String[] args) {


    /*
     Given a string of any length, return a new string where the last 2 chars,
     if present, are swapped, so "coding" yields "codign".
     lastTwo("coding") → "codign"
     lastTwo("cat") → "cta"
     lastTwo("ab") → "ba"
     */

        String str = "cat";
//        if (str.length() > 1) {
//            System.out.println(str.substring(0, str.length() - 2) + str.charAt(str.length() - 1)
//                    + str.charAt(str.length() - 2));
//        } else {
//            System.out.println(str);
//        }

    }

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        } else {
            return str;
        }
    }
}
