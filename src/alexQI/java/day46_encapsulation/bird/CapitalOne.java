package alexQI.java.day46_encapsulation.bird;

public class CapitalOne {

    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(431154324213L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 Checking");

        System.out.println("acc = " + acc);
    }
}
