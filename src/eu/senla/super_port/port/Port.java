package eu.senla.super_port.port;

import eu.senla.super_port.ship.Ship;
import eu.senla.super_port.weighable.Weighable;
import java.util.ArrayList;
import java.util.List;

public class Port implements Weighable {

    private final List<Ship> ships = new ArrayList<>();
    private final int maxNumberOfShips;

    public Port(int maxNumberOfShips) {
        this.maxNumberOfShips = maxNumberOfShips;
    }

    public boolean addShip(Ship ship) {
        return ships.size() < maxNumberOfShips && ships.add(ship);
    }

    public void deleteShipByIndex(int index) {
        ships.remove(index);
    }

    @Override
    public int getWeight() {
        return getWeightFromWeighables(ships);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("I am port, my ships are: \n");
        for (Ship ship : ships) {
            result.append(ship).append("\n");
        }
        result.append("This is the end of port! \n");
        return result.toString();
    }
}
