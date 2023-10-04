package alexQI.OficeHours.Practice_03_30_2021;
import java.util.Scanner;

public class CreatEmail {
    /*
        [Creating an email]
       Ask user to enter two strings should be at least 6 character long. If they are shorter than
       that print "Invalid data" and program should end.
    If the information provided is valid, you will take the first 4 characters of string and combine
    them with the last three characters of the second string. At the end of your combined string add "@cybertek.com"
     and print the final string as your created email. The final email should be in all lowercase.

    input: JamesBond Secret
    output: jameret@cybertek.com
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = input.nextLine();
        String wordTwo = input.nextLine();
        String email = "";

        if(wordOne.length() >= 6 && wordTwo.length() >= 6) {

            email = wordOne.substring(0, 4); //james
            email += wordTwo.substring(wordTwo.length()-1);//Secret
            email += "@cybertek.com";
            System.out.println(email);

        } else {
            System.out.println("Invalid data");
        }
    }
}
