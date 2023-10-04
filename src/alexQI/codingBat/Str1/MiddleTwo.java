package alexQI.codingBat.Str1;

public class MiddleTwo {
    public static void main(String[] args) {
        /**
         *
         Given a string of even length, return a string made of the middle two chars,
         so the string "string" yields "ri". The string length will be at least 2.
         middleTwo("string") → "ri"
         middleTwo("code") → "od"
         middleTwo("Practice") → "ct"
         */
        String str = "string";
        if(str.length() % 2 == 1) {
            System.out.println(str.substring(str.length()/2, str.length()/2+1));
        }else{
            int index = str.length()/2;
            System.out.println(str.substring(index-1, index+1));
        }

    }
}
