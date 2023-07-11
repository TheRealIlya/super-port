package eu.senla.super_port.container.density;

public enum WaterDensity {

    LIGHT(1000),
    MEDIUM(1300),
    HEAVY(1500);

    private final int density;

    WaterDensity(int density) {
        this.density = density;
    }

    public int getValue() {
        return density;
    }
}
