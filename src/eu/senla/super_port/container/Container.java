package eu.senla.super_port.container;

import eu.senla.super_port.container.density.WaterDensity;
import eu.senla.super_port.weighable.Weighable;

public abstract class Container implements Weighable {

    private final int height;
    private final int density;
    private final int length;
    private final int width;

    protected Container(int height, WaterDensity waterDensity, int length, int width) {
        this.height = (height > 40 || height < 10) ? 10 : height;
        this.density = waterDensity.getValue();
        this.length = length;
        this.width = width;
    }

    public abstract int getMaxNumberOnDeck();

    @Override
    public int getWeight() {
        return length * width * height * density;
    }

    @Override
    public String toString() {
        return "Container{" +
                "height=" + height +
                ", density=" + density +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
