package Ecaterina.OficceHours.day06_08_03_2022;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number");
        int num1 = scanner.nextInt();
        System.out.println("second number");
        int num2 = scanner.nextInt();

        System.out.println("add(num1,num2) = " + add(num1, num2));
        System.out.println("subtract(num1,num2) = " + subtract(num1, num2));
        System.out.println("devide(num1,num2) = " + devide(num1, num2));
        System.out.println("multiply(num1,num2) = " + multiply(num1, num2));
    }

    public static int multiply(int num1, int num2) {
        return num1+num2;
    }

    public static double devide(int num1, int num2) {
        return num1/num2;
        
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;

        
    }

    public static int add(int num1, int num2) {
        return num1+num2;
        
    }
}
