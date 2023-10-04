package alexQI.java.day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "java";
        for(int i = 0; i < word.length(); i++){
            System.out.println(i+ " - " +word.charAt(i));
        }


        /**
         * Long way, without loop.
         * System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
         System.out.println(word.charAt(4)); ERROR //java
        */
        /**
         * print word letters in reverse
         */
        word = "java";
        for(int i = 3; i >= 0; i--) { //3->word.length() - 1
            System.out.println(word.charAt(i));
        }
    }
}
