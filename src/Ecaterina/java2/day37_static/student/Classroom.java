package Ecaterina.java2.day37_static.student;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {
        CydeoStudent st = new CydeoStudent("Lasara", "Zaandam", 1);
        st.drink();

        System.out.println("st.myCoffee = " + st.myCoffee);
        CydeoStudent.schoolInfo();

    }
}
