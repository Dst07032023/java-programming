package alexQI.java.day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "JExperience in Java, Selenium, Cucumber, Tomato,JUnit";
        double salary = 12300;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + title);
        System.out.println("Company: " + company);
        System.out.println("jobDescription: " + jobDescription);
        System.out.println("Salary: $ " + salary);
        System.out.println("Years of experience: " + yearsOfExp);
        System.out.println("Has benefits? " + hasBenefits);
    }
}
