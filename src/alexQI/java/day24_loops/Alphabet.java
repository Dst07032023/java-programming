package alexQI.java.day24_loops;

/**
 * a b c d e ......z
 * z....a
 */

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
      //  System.out.println("letter = " + letter);
        //letter++;
       // System.out.println("letter = " + letter);
        while (letter <= 'z') {
            System.out.print(letter+" ");
            letter++;
        }
        //print alphabet reverse order
        System.out.println();
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;
        }

    }
}
