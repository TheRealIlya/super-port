package eu.senla.super_port.weighable;

import java.util.Collection;

public interface Weighable {

    int getWeight();

    default int getWeightFromWeighables(Collection<? extends Weighable> weighables) {
        return weighables.stream()
                .map(Weighable::getWeight)
                .reduce(Integer::sum)
                .orElse(0);
    }

}
