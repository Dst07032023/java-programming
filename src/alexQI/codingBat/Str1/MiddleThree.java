package alexQI.codingBat.Str1;

public class MiddleThree {
    public static void main(String[] args) {
        /*
        Given a string of odd length, return the string length 3 from its middle,
        so "Candy" yields "and". The string length will be at least 3.
    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
         */
        String str = "solving";
        int index = str.length()/2;
        System.out.println(str.substring(index-1, index+2));
    }
}
