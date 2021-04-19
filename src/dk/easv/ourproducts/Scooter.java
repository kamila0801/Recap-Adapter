package dk.easv.ourproducts;

public class Scooter extends Vehicle {
    public Scooter(Color color) {
        super(color);
    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return 40;
    }

    @Override
    public void honk() {
        System.out.println("Tooot tooot");
    }

    @Override
    public String getName() {
        return "Scooter";
    }
}
