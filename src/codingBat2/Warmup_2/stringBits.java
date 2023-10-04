package codingBat2.Warmup_2;

/**
 *
 Given a string, return a new string made of every other
 char starting with the first, so "Hello" yields "Hlo".


 stringBits("Hello") → "Hlo"
 stringBits("Hi") → "H"
 stringBits("Heeololeo") → "Hello"
 */

public class stringBits {
    public static void main(String[] args) {

    }
    public String stringBits(String str) {
        String rest = "";

        for(int i = 0; i < str.length(); i +=2){
            rest = rest + str.substring(i,i+1);
        }
        return rest;
    }
}
