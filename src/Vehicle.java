public class Vehicle {
    //Inheritance from weight, every vehicle has a weight
    protected int weight;
    protected String manufacture;

    public Vehicle(int weight, String manufacture) {
        this.weight = weight;
        this.manufacture = manufacture;
    }

    public Vehicle() {
    }
}
