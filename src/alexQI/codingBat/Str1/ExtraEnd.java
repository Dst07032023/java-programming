package alexQI.codingBat.Str1;

public class ExtraEnd {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("extraEnd(str) = " + extraEnd(str));
    }

    public static String extraEnd(String str) {
        String last = str.substring(str.length() - 2);
        return last + last + last;
    }
}
