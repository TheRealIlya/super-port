package eu.senla.super_port.container;

import eu.senla.super_port.container.density.WaterDensity;

public class SmallContainer extends Container {

    private static final int LENGTH_AND_WIDTH = 10;
    private static final int MAX_NUMBER = 5;

    public SmallContainer(int height, WaterDensity waterDensity) {
        super(height, waterDensity, LENGTH_AND_WIDTH, LENGTH_AND_WIDTH);
    }

    @Override
    public int getMaxNumberOnDeck() {
        return MAX_NUMBER;
    }
}
