package eu.senla.super_port.container;

import eu.senla.super_port.container.density.WaterDensity;

public class BigContainer extends Container {

    private static final int LENGTH_AND_WIDTH = 20;
    private static final int MAX_NUMBER = 2;

    public BigContainer(int height, WaterDensity waterDensity) {
        super(height, waterDensity, LENGTH_AND_WIDTH, LENGTH_AND_WIDTH);
    }

    @Override
    public int getMaxNumberOnDeck() {
        return MAX_NUMBER;
    }
}
