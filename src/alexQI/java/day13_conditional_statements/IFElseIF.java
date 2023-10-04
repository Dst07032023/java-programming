package alexQI.java.day13_conditional_statements;

public class IFElseIF {
    public static void main(String[] args) {
        char grade = 'C';

        if(grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Good");
        } else if (grade == 'C') {
            System.out.println("Not Bad");
        }else{
            System.out.println("Could be better");

        }
    }
}
