package alexQI.OficeHours.Practice_04_06_2021;
import java.util.Random;

public class RandomSixDigitNumber {
    public static void main(String[] args) {
        /*
        CHALLENGE -THIS WILL MAY BE DIFFICILT BUY TRY IT. DON'T SPEND TOO MUCH TIME
        Generate a random number that is six digits long. Each digit in this number should be unique
        HINTS: Loops, String, Random
         */

        Random random = new Random();

        String randomNumber = "";

        while (randomNumber.length() != 6) {
            int eachRandom = random.nextInt(10);
            if(!randomNumber.contains("" + eachRandom)) {
                randomNumber += eachRandom;
            }
        }

        System.out.println("Random Number: " + randomNumber);


    }
}
