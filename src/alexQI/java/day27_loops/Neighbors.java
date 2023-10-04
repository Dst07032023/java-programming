package alexQI.java.day27_loops;

public class Neighbors {
    public static void main(String[] args) {
                     //012345678910111213
        String word = "jaavvajjaajjaaapprrogrramm";

        for(int index = 0; index < word.length()-1; index++) {
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
            if (word.charAt(index) == word.charAt(index+1)) {
                System.out.println("beep - " + word.charAt(index));


            }

        }
    }
}
