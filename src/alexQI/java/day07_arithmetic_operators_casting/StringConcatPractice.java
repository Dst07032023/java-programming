package alexQI.java.day07_arithmetic_operators_casting;


public class StringConcatPractice {
    public static void main(String[] args) {

        System.out.println("java " + 5 + 3); // java 53
        System.out.println("java " + (5 + 3)); // java 8
        System.out.println(5 + 3 + " java");// 8 java
        System.out.println(5 + (3 + " java")); //53 java

        System.out.println("hello " + 1 + 2 + 3);  // hello 123
        System.out.println("hello " + (1 + 2 + 3)); // hello 6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + " " + str2); //hello fiends
        System.out.println(str1);
        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2); //15
        System.out.println(num1 + " " + num2); //7 8
        System.out.println(num1 + "" + num2);// 78
        char char1 ='a';
        char char2 = 'b';

        System.out.println(char1 + char2);
        System.out.println(char1 + "" + char2);//ab
        
    }
}
