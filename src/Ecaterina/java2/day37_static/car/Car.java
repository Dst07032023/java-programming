package Ecaterina.java2.day37_static.car;

public class Car {

    String model;
    Driver driver;


    //when I call the Car constructor, the code inside is calling the Driver constructor
    public Car(String model, String name, long licenceNumbers, char licenseType){
        this.model = model;
        driver = new Driver(name, licenceNumbers, licenseType);//creating a Driver object
    }

    public Car(String model, Driver driver){
        this.model = model;
        this.driver = driver;
    }
}
