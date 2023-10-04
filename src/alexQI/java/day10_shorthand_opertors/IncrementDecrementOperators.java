package alexQI.java.day10_shorthand_opertors;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("lines of code = " + linesOfCode);
        //increase linesOfCode by 1 , 4 different ways that we learnt today
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        //++linesOfCode++; //error
        System.out.println("linesOfCode = " + linesOfCode);

        //type 4 different ways of decreasing by 1
        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--;letter--;
        System.out.println("letter = " + letter);


    }
}
