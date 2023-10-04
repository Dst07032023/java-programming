package alexQI.java.day42_arraylist;

import alexQI.java.day41_arrayList.ArraysAsList;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.*;

public class MethodWithList {
    public static void main(String[] args) {
        //declare String arrayList and add values
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23, 54554, 234, 11, 5,2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }

    /**
      methodName: printStrList
     param: List of Strings
     return: void
     prints all values separated by space in same line
     */
    public static void printStrList(List<String> stringList) {//"java", "apple", "coffee", "tes"
        for(String str : stringList){
            System.out.print(str + " ");
        }
        System.out.println();
    }

    /**
     method: sumIntegerList
     param: List of integers
     returns int
     calculates sum of integers in the list then returns
     */

    static public int sumIntegerList(List<Integer> list){
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum;
    }
}
