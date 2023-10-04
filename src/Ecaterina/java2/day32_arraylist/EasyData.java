package Ecaterina.java2.day32_arraylist;

import java.util.*;

public class EasyData {

    /*
    getDaysOfWeek will return an ArrayList of String with all the days of the week
     */

    public static ArrayList<String> getDaysOfWeek(){
        return new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"));
    }

    public static ArrayList<Integer> getRandomNumbers(int limit) {
        Random random = new Random(); // Research about this class, look at documentation
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < limit; i++){
            list.add(random.nextInt(1000));//0 to 1000
        }
        return list;

    }
}
