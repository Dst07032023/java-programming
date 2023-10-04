package alexQI.OficeHours.Practice_03_2_2021;

// src -> new package called OfficeHours -> new package called
//Practice_03_02_2021

/*
Make a class PersonInfo
make a main method

    Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of sibilings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite  quote

    - Print the person information

    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
 */

public class PersonInfo {
    public static void main(String[] args) {
        // Variables without any data

        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        //Assignment of data
        name = "Saim";
        age = 50;
        gender = 'M';
        student = true;
        numberOfSiblings = 5;
        favoriteNumber = 3L;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        //fullBirthDate = ""+ birthDate "." + year; //3.2.2021
        fullBirthDate = "" + birthDate + '.' + year;
      //  fullBirthDate = "" + birthDate + year; //3.22021 -> adds first then turns to String
        favoriteQuote = "have a good mindset";
        fullBirthDate = "" + birthDate + '.' + year; //

        System.out.println(fullBirthDate);
        System.out.println(birthDate + '.'); // 3.2 +46
        // double  char -> not concatination, it is addition

        System.out.println("Name:\t\t" + name);
        boolean printName = true;
        System.out.println(printName);
        System.out.println("Age:\t\t" + age);
        System.out.println("Full birthdate:\t\t" + fullBirthDate);

        //Other printing




    }


}
