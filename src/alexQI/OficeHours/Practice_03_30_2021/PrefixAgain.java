package alexQI.OficeHours.Practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {
        /*
        Given a String str and a number n check if the prefix (made of up of the first n characters) appears in the remaining part of String. Print true or false.

        Assume that the String is not empty and that n is in the range from 1 to str.length().

        Ex:
        input: abXYabc
        input: 1

        output: true
         */

        String str = "abXYabc";
        int n = 1 ;
                //ab  bXYabc

        String prefix = str.substring(0,n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));


    }
}
