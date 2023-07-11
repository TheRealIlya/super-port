package eu.senla.super_port.deck;

import eu.senla.super_port.container.Container;
import eu.senla.super_port.weighable.Weighable;
import java.util.ArrayList;
import java.util.List;

public class Deck implements Weighable {

    private final List<Container> containers = new ArrayList<>();
    private int maxNumberOfContainers;

    public boolean addContainer(Container container) {
        if (containers.isEmpty()) {
            maxNumberOfContainers = container.getMaxNumberOnDeck();
        }

        if (containers.size() < maxNumberOfContainers && maxNumberOfContainers == container.getMaxNumberOnDeck()) {
            return containers.add(container);
        }
        return false;
    }

    @Override
    public int getWeight() {
        return getWeightFromWeighables(containers);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "containers=" + containers +
                '}';
    }
}
