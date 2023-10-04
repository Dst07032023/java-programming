package alexQI.java.day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();//helps generate random number
        String password = "";

        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); //random num 0 - 70
            System.out.print(source.charAt(index));
            //source.substring(index, index + 1);
            //System.out.println(random.nextInt(source.length()));
            //add the char to password variable using +=
            //password = password + source.charAt(index);
            password += source.charAt(index);
        }
        //main(null);

        System.out.println("\nYour password = " + password);



    }
}
