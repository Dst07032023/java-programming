package practice;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        String[] arrWord = {"water", "drink", "bottle", "banana", "kiwi", "peach", "apple", "an"};
//        String temp = arrWord[0];
//
//        for (int i = 0; i < arrWord.length; i++) {
//
//            if (temp.length() > arrWord[i].length()){
//                temp = arrWord[i];
//            }
//        }
//        System.out.println(temp);
        System.out.println("rotateLeft3(new int[] {1,2,3}) = " + Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));

    }

    public  static int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        nums[0]=nums[1];
        nums[1]=nums[2];
        nums[2]=nums[temp];
        return nums;

    }

}
