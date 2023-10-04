package alexQI.codingBat.Str1;

public class EndsLy {
    public static void main(String[] args) {
        String str = "kjhfdgQLly";
        if (str.length() < 2) {
            System.out.println(false);
        } else if (str.equals("ly")) {
            System.out.println(true);
        }
        if (str.length() > 2 && str.substring(str.length() - 2).equals("ly")) {
            System.out.println(true);
        }
    }

    /*
    Given a string, return true if it ends in "ly".
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
     */

}
