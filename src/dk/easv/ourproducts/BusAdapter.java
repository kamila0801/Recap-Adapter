package dk.easv.ourproducts;

import dk.easv.theirproducts.Bus;

public class BusAdapter extends Vehicle {
    private Bus bus;

    public BusAdapter(Vehicle.Color color) {
        super(color);
        switch(color) {
            case Yellow -> bus = new Bus(Bus.Color.Yellow);
            case Blue -> bus = new Bus(Bus.Color.Blue);
        }

    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return Bus.topSpeedInMilesPerHour;
    }

    @Override
    public void honk() {
        System.out.println("honk honk");
    }

    @Override
    public String getName() {
        return "Bus";
    }
}
