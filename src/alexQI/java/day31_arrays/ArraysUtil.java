package alexQI.java.day31_arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in same line
        System.out.println(java.util.Arrays.toString(nums));

        //sort nums, re-arrange change array values in ascending order
        java.util.Arrays.sort(nums);
        System.out.println(java.util.Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums, Collection.reverseOreder);

        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
        System.out.println(java.util.Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");
        //sort words in alphabetic and ASCII order
        java.util.Arrays.sort(words);
        System.out.println(java.util.Arrays.toString(words));

        //sort words in reverse order
        java.util.Arrays.sort(words, Collections.reverseOrder());

        System.out.println(java.util.Arrays.toString(words));
    }
}
