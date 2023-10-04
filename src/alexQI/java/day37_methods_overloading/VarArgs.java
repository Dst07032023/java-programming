package alexQI.java.day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(10, 200, 300);
        addNumbers(23,23,231,12,32,221,4,212,231,123,23,12);
        addNumbers();

        //int... myNumber = 10, 4; -> ERROR, var-args canONLY be used as a method parametr
    }
    //varargs
    public static void addNumbers(int... nums) {
        //inside the method, it is used as regular array
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
