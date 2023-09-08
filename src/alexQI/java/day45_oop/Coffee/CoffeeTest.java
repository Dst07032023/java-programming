package alexQI.java.day45_oop.Coffee;

import alexQI.java.day45_oop.Coffee.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeTest {
    public static void main(String[] args) {
        List<Coffee> list = new ArrayList<>();
//        while(true) {
            Coffee myCoffee = new Coffee();
            list.add(myCoffee);
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
            Coffee coffee1 = new Coffee();
            coffee1.setType("cappuccino");
            System.out.println("coffe1 type = " + coffee1.getType());
            //assign coffee1 object to coffee2
            //hey java, point coffee2 to same object as coffee1
            Coffee coffee2 = coffee1;
            System.out.println("coffee2 type = " + coffee2.getType());
            coffee2.setType("Espresso");

            Coffee coffee3 = new Coffee();
            coffee3.setType("Frappucino");

            coffee3 = coffee2;
            System.out.println("coffee3 type = " + coffee3.getType());

            Coffee coffee4 = null; //reference variable does not refer/point to any object in HEAP
            coffee4.setType("turkish"); //NullPointerException
//        }
    }
}
