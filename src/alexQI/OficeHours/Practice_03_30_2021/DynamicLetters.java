package alexQI.OficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class DynamicLetters {
    /*
    [Dynamic alphabet]
        -Write a program that will ask 'upper' or 'lower'
        -If it is upper: print the alphabet in all uppercase letter from A to Z - If it is lower:
        print the alphabet in all uppercase letter from a to z
        - Challenge: Also ask if they want to show the alphabet is ascending or order descending
        - Ascending: A-Z or a-z
        - Descending: Z-A or z-a
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = input.next();
        int starting;
        int ending;

        if (upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }

        //for(int i= 'A'; i < 'Z'; i++) {
        if (ascendingOrDescending.equals("ascending")) {
            for (int i = starting; i <= ending; i++) { //i += 2
                System.out.print((char)i + " ");
                //System.out.println(i + " ");
            }
    } else {
        for(int i= ending; i >= starting; i--) {
            System.out.println((char)i + " ");
        }
        }
    }
}
