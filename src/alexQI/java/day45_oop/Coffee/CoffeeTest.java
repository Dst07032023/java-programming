package alexQI.java.day45_oop.Coffee;

import alexQI.java.day45_oop.Coffee.Coffee;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
//      NOT : myCoffee.type = "Turkish coffee"; INSTEAD using a method:
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        //describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        //ADD ANOTHER COFFEE OBJECT, SET VALUES, CALL METHODS
    }
}
