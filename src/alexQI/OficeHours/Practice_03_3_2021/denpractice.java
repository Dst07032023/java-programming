package alexQI.OficeHours.Practice_03_3_2021;

public class denpractice {
    public static void main(String[] args) {
        double numOne = 7;
        double numTwo = 12;
        double numThree = 21;
        double numFour = 23;
        double numFive = 29;

        double addition = numOne + numTwo;
        double substraction = numThree - numFour;
        double multiplication = numOne * numThree * numFour;
        double devision = numThree / numFive;
        double remainder = addition % substraction % multiplication % devision;

        System.out.println(numOne + " + " + numTwo + " = " + addition);
        System.out.println(numThree + " - " + numFour + " = " + substraction);
        System.out.println(numOne + " * " + numThree + " * " + numFour + " = "+ multiplication);
        System.out.println(numThree + " / " + numFive + " = " + devision);
        System.out.println(addition + " % " + substraction + " % " + multiplication+
                " % " + devision + " = " + remainder);



    }
}
