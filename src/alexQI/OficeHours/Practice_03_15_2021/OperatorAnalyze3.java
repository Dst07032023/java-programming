package alexQI.OficeHours.Practice_03_15_2021;

public class OperatorAnalyze3 {
    public static void main(String[] args) {

        int a = 10;
        int b = a - 5 * 2 + a / 2;
        //      10- 5 * 2 + 10/2
        //      10- 10 + 10 / 2
        //      10- 10 + 5
        //      0 + 5
        //      5

        int sum = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);
    }
}
