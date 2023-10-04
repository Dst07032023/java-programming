package Ecaterina.OficceHours.day06_08_03_2022;

public class CallingMethod {
    public static void main(String[] args) {
        printWordNTimes("Rabia",5);
        printWordNTimes("Adam", 3);

    }

    public static void printWordNTimes(String name, int count) {
        for (int i=0; i < count; i++) {
            System.out.println(name);
        }

    }
}
