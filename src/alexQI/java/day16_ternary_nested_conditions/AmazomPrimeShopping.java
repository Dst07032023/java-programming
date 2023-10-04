package alexQI.java.day16_ternary_nested_conditions;

public class AmazomPrimeShopping {
    public static void main(String[] args) {
        double price = 45.0;
        boolean isPrimeMember = true; //false

        if(isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (price >= 25.0) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. Fee = $10");
            }
        }
    }
}
