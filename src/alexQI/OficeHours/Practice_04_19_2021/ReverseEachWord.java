package alexQI.OficeHours.Practice_04_19_2021;

import alexQI.java.day38_methods.StringUtils;

public class ReverseEachWord {
    /*
        Reverse Each word
    Given a String, reverse each individual word and print the result Hint: Use a nested loop
    Input:
    It started to snow in Chicago

    Output:
    tI detrats ot wons ni ogacihC

     */
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }

    public static String reverseEachWord(String str) {
        String reverse = "";

        for(String each : str.split(" ")) {

            String eachReverse = "";

            //Here we would reverse each String with a for loop
            //going from the last index to the first index

            reverse += StringUtils.reverse(each) + " ";

        }

        return reverse.trim();

    }
}
