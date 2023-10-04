package alexQI.java.day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 211;

       if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }

        switch(month) {
            case 12:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;

        }

        if (month == 3 || month == 4 || month ==5) {
            System.out.println("Sprint");
        }

        switch(month) {
            case 3:
                System.out.println("Sprint");
                break;
            case 4:
                System.out.println("Sprint");
                break;
            case 5:
                System.out.println("Sprint");
                break;
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        }
         switch(month) {

             case 6:
                 System.out.println("Summer");
                 break;
             case 7:
                 System.out.println("Summer");
                 break;
             case 8:
                 System.out.println("Summer");
                 break;
             }

         if (month == 9 || month == 10 || month == 11) {
             System.out.println("Fall");
         }

         switch(month) {
             case 9:
                 System.out.println("Fall");
                 break;
             case 10:
                 System.out.println("Fall");
                 break;
             case 11:
                 System.out.println("Fall");
                 break;
             default:
                 System.out.println("invalid month - " + month);
         }
//         switch(month) {
//              case 9:
//              case 10:
//              case 11:
//              (case 9: case 10: case 11:)
//                  System.out.println("Fall")
//                  break;

    }
}
