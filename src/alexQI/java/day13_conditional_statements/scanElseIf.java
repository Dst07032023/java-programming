package alexQI.java.day13_conditional_statements;
import java.util.Scanner;

public class scanElseIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your shoe size:");
        int size = scan.nextInt();
        // 6 - 12
        if(size >= 12){
            System.out.println("Sorry, your shoe size is not in stock");
        }else if(size >= 6) {
            System.out.println("Your shoe is in stock!");
        } else {
            System.out.println("Sorry, this store does not carry shoes smaller than size 6");
        }
    }
}
