package Ecaterina.java2.day37_static.car;

public class Driver {

    String name;
    long licenceNumber;
    char licenseTye;

    public Driver(String name, long licenceNumber, char licenseTye) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.licenseTye = licenseTye;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", licenseTye=" + licenseTye +
                '}';
    }
}
