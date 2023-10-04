package practice.GetereSetter;

public class Fish {
    private String type;
    private int weight;
    private double cost;

    public void setType(String fishType) {
        type = fishType;
    }
    public String getType() {
        return type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
     public double getCost() {
        return cost;
     }

     public String toString() {
        return "Fish{" +
                "type='" + type + '\'' +
                ",weight=" + weight +
                ", mileage=" + cost +
                '}';
     }

}

