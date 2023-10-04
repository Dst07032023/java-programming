package alexQI.OficeHours.Practice_03_16_2021;

public class ExamplesIf {
    public static void main(String[] args) {

        int a = 10;
        int b = a-- * 2 - --a % 2 + a;
        //      10  * 2 - 8   % 2 + 8
        //      20 - 8 % 2 + 8
        //      20 - 0 + 8
        //       20 + 8
        //       28
        System.out.println(b);


        // 8 % 2 = 0
        // 8/2 = 4

        // 9%2 = 1
        // 9/2 => 2 + 2 + 2 + 2 = 8

        //even and old

        if(11 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
