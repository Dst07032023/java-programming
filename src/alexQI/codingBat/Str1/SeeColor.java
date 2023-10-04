package alexQI.codingBat.Str1;

public class SeeColor {
    public static void main(String[] args) {
        String str = "xbluexx";
        /*
        Given a string, if the string begins with "red" or "blue" return that
         color string, otherwise return the empty string.
    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
         */
        if (str.startsWith("red")) {
            System.out.println(str.substring(0, 3));
        }else if (str.startsWith("blue")) {
            System.out.println(str.substring(0, 4));
        }else{
            System.out.println("");
        }
    }

}
