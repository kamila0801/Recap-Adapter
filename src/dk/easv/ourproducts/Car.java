package dk.easv.ourproducts;

public class Car extends Vehicle {

    public Car(Color color) {
        super(color);
    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return 200;
    }

    @Override
    public void honk() {
        System.out.println("Honk! Honk!");
    }

    @Override
    public String getName() {
        return "Car";
    }
}
