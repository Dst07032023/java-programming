package Ecaterina.java2.day35_custom_classes.traffic;

public class TrafficLight {

    String color;

    public TrafficLight(String inputColor){
        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yelow")
                || inputColor.equalsIgnoreCase("green");

        if(isValid){
            color = inputColor;
        }

    }
}
