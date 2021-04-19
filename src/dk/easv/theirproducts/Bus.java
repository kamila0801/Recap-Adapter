package dk.easv.theirproducts;

public class Bus {
    private Color color;
    public static final int topSpeedInMilesPerHour = 50;

    public enum Color {
        Yellow,
        Blue
    }

    public Bus(Color color) {
        this.color = color;
    }
}
