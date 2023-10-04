package alexQI.OficeHours.Practice_03_29_2021;

public class Sandwich {
    public static void main(String[] args) {
        /*
            A sandwich is two pieces of bread with something in between.
        Print the string that is between the first and last appearance of "bread"
        in the given string, or return string "nothing" if there are not two pieces of bread.s


                input: breadjambread
                output: jam

                input: xxbreadapple
                output:nothing
         */

        String str = "breadjambread"; //0+5=5-> substring(5)-> jam.contain bread
        /*boolean isValid = false;
          String result = " ";
         */


        if(str.contains("bread")) {

            int firstBread = str.indexOf("bread");

            if(str.substring(firstBread+5). contains("bread")) { //jambread

                /*int secondBread = str.lastIndexOf("bread")
                  result = str.substring(firstBread + 5, secondBread);
                 */

                //int secondBread = str.substring(firstBread+5).indexOf("bread");
                //System.out.println("2 bread");

                /* if(result.isEmpty()){
                   System.out.println("nothing");
                   }else{
                   System.out.println(result);
                 */


                int secondBread = str.lastIndexOf("bread");
                System.out.println(str.substring(firstBread + 5,secondBread));
                //                                      0+5-> 5,8

        } else {
            System.out.println("nothing");
            }

            /* if(!isValid){
            System.out.println("nothing");
            }else{
            System.out.println(result);
            }
             */
        }
        }

    }

