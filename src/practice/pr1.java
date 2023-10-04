package practice;

import java.util.*;



public class pr1 {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(Arrays.asList(8,9,8,2,5,5,3,2));
        System.out.println(number);;
        List<Integer> unList = getUnIntegers(number);
        System.out.println("\nunList = " + unList);
    }

    private static List<Integer> getUnIntegers(List<Integer> number) {
        List<Integer> unList = new ArrayList<>();
        for(int num : number){
            if(Collections.frequency(number, num) == 1){
                System.out.println(num + " ");
                unList.add(num);
            }
        }
        return unList;
    }
}
