package alexQI.OficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {

        // byte -> short -> int -> long -> float -> double
        /*
        by default whole number will be read as int datatype
        by default decimal numbers will be read as double datatype
         */

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d; //int = [(short)double] -> int = short
        int i2 = (int)d;
        System.out.println(i); //5
        System.out.println((double)i); //5.0
        System.out.println((double)b2);
        System.out.println((float)i2);

        float f = 3.54f;
        float f2 = (float)3.54; //float = (float)double

        float f3 = 5; //float = int -> 5.0
        float f4 = 5.5f; //float = double

        System.out.println((int)f);
        System.out.println((short)f2);
        System.out.println((long)f3);
        System.out.println((byte)f4);
        System.out.println(f4);
        System.out.println((double)f4);

        long l = 22313; //long = int
        long l2 = 312323213232L;
        //long l3 = (long)312323213232L; -> doesn't work because the number is too big for int, next get to cast'
        System.out.println(l);
        System.out.println((double)l);

        System.out.println((float)l);
        System.out.println(l2);

        double million = 1_000_000;
        System.out.println(million);






    }
}
