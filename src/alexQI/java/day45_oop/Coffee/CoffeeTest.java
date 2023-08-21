package alexQI.java.day45_oop.Coffee;

import alexQI.java.day45_oop.Coffee.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeTest {
    public static void main(String[] args) {
        List<Coffee> list = new ArrayList<>();
        while(true) {
            Coffee myCoffee = new Coffee();
            list.add(myCoffee);
            System.out.println("coffee amount = " + myCoffee.getAmount());
            myCoffee.refill();
//            System.out.println("amount after refill = " + myCoffee.getAmount());
//            myCoffee.drink(10);
//            System.out.println("amount after drink 10 = " + myCoffee.getAmount());
////      NOT : myCoffee.type = "Turkish coffee"; INSTEAD using a method:
//            myCoffee.setType("Turkish coffee");
//            System.out.println("My coffee = " + myCoffee.getType());
//            //describe myCoffee - show all variable values
//            System.out.println(myCoffee.toString());

            //ADD ANOTHER COFFEE OBJECT, SET VALUES, CALL METHODS
//        main(null);
        }
    }
}
