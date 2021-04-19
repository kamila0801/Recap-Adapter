package dk.easv.ourproducts;

public class Bicycle extends Vehicle {

    public Bicycle(Color color) {
        super(color);
    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return 22;
    }

    @Override
    public void honk() {
        System.out.println("Dring, dring");
    }

    @Override
    public String getName() {
        return "Bicycle";
    }
}
