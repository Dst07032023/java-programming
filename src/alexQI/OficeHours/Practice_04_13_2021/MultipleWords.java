package alexQI.OficeHours.Practice_04_13_2021;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        /*
        Given a String of words that are separate by commas. Find and print any words that have more than one word
        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge,dish washer"
         */
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] arrWords = words.split(", ");
        System.out.println(Arrays.toString(arrWords));

        for(String eachWord : arrWords) {
            if(eachWord.contains(" ")) {
            System.out.println(eachWord);
            }
        }
    }
}
