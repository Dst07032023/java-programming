package alexQI.java.day10_shorthand_opertors;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        //String weather = "rainy";
        //System.out.println("weather = " + weather);
        String weather = scan.nextLine();
        //String weather = scan.next();
        System.out.println(weather + " - is a nice day today!");



    }
}
