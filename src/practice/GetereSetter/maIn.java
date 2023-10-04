package practice.GetereSetter;

public class maIn {

    public static void main(String[] args) {
         Fish fish1 = new Fish();

         fish1.setType("Carasic");
        System.out.println("fish1 type = " + fish1.getType());

        fish1.setWeight(5);
        System.out.println("fish1 weight = " + fish1.getWeight());

        fish1.setCost(500);
        System.out.println("fish1 cost = " + fish1.getCost());

        System.out.println(fish1);
    }
}
