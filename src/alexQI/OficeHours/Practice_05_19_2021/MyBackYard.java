package alexQI.OficeHours.Practice_05_19_2021;

public class MyBackYard {
    public static void main(String[] args) {

        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
        //birdOne.canFly; -> error
        birdOne.setCanFly(true);
        System.out.println(birdOne.canFly());
        birdTwo.setBeakLength(-1);
        System.out.println(birdTwo.getBeakLength());
    }
}
