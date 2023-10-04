package alexQI.java.day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;

        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;

        double remainingBalance = balance - price1 - price2 - price3;
       // double remainingBalance = balance - (price1 + price2 + price3);

        //balance = remainingBalance; // balance: 345.55 remainingBalance: 219.68
        System.out.println("Your initial balance: $" + balance);
        System.out.println("Your remaining balance: $" + remainingBalance);

        /*
        int balance1 = 345;
        int price4 = 22;
        int price5 = 89;
        int price6 = 15;
        int remainingBalance1 = balance1 - (price4 + price5 + price6);
        System.out.println("Your remaining balance: $" + remainingBalance1);
        */

        int balanceWithNoCents = (int)remainingBalance; //ramainingBalance: 219.68
        System.out.println("You remaining balance without cents: $" + balanceWithNoCents);






    }
}
