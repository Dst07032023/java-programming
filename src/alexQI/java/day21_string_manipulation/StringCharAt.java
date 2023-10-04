package alexQI.java.day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        // System.out.println(word.charAt(4)); -> ERROR
        System.out.println(word+ "-" +word.length());//4

        String company = "Cybertek";
        System.out.println("first letter: " +company.charAt(0));
        char first = company.charAt(0);
        //System.out.println(first);
        char second = company.charAt(1);
        //System.out.println(second);
        char third = company.charAt(2);
        //System.out.println(third);
        char fourth = company.charAt(3);
        //System.out.println(fourth);
        char fifth = company.charAt(4);
        //System.out.println(fifth);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);

        //C y b e r t e k
        System.out.println(first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+
                " "+seventh+" "+eighth);

        String withSpace = first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+
                " "+seventh+" "+eighth;

        System.out.println("withSpace = " + withSpace);
    }
}
