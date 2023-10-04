package alexQI.java.day25_loops;

public class PrintStars {
    public static void main(String[] args) throws InterruptedException {
        for( int stars = 1; stars <= 15; stars++) {
            System.out.print("\uD83C\uDF1F * ");
            Thread.sleep(1000);
        }

        System.out.println();//start new line
        String myStars = "";
        //for loop: fill 5 stars to myStars variable.
//        for(int i = 1; i <=5; i++){
//            myStars += "* "; //myStars = myStars +"*";

        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        System.out.println("my stars = " + myStars.trim()); //* * * * *

        myStars = "";
        for(int i = 1; i <= 5; i++){
            myStars += "+ ";
        }
        System.out.println("my stars = " + myStars.trim());
    }
}
