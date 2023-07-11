package eu.senla.super_port.deck;

import eu.senla.super_port.container.Container;
import eu.senla.super_port.weighable.Weighable;
import java.util.Arrays;

public class Deck implements Weighable {

    private Container[] containers;
    private int maxNumberOfContainers;
    private int numOfContainers = 0;

    public boolean addContainer(Container container) {
        if (numOfContainers == 0) {
            maxNumberOfContainers = container.getMaxNumberOnDeck();
            containers = new Container[maxNumberOfContainers];
        }

        if (numOfContainers < containers.length && maxNumberOfContainers == container.getMaxNumberOnDeck()) {
            containers[numOfContainers++] = container;
            return true;
        }
        return false;
    }

    @Override
    public int getWeight() {
        int weight = 0;
        for (Container container : containers) {
            if (container != null) {
                weight += container.getWeight();
            }
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "containers=" + Arrays.toString(containers) +
                '}';
    }
}
