package eu.senla.super_port.container;

import eu.senla.super_port.container.density.WaterDensity;
import eu.senla.super_port.weighable.Weighable;

public abstract class Container implements Weighable {

    private final int height;
    private final int density;
    private int length;
    private int width;

    protected Container(int height, WaterDensity waterDensity) {
        if (height > 40 || height < 10) {
            this.height = 10;
        } else {
            this.height = height;
        }
        this.density = waterDensity.getValue();
    }

    public abstract int getMaxNumberOnDeck();

    @Override
    public int getWeight() {
        return length * width * height * density;
    }

    protected void setLength(int length) {
        this.length = length;
    }

    protected void setWidth(int width) {
        this.width = width;
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
