package eu.senla.super_port.port;

import eu.senla.super_port.ship.Ship;
import eu.senla.super_port.weighable.Weighable;

public class Port implements Weighable {

    private final Ship[] ships;
    private int numberOfShips = 0;

    public Port(int maxNumberOfShips) {
        if (maxNumberOfShips < 2 || maxNumberOfShips > 10) {
            ships = new Ship[2];
        } else {
            ships = new Ship[maxNumberOfShips];
        }
    }

    public boolean addShip(Ship ship) {
        if (numberOfShips >= ships.length) {
            return false;
        }
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                numberOfShips++;
                break;
            }
        }
        return true;
    }

    public boolean deleteShipByIndex(int index) {
        if (index < 0 || index >= ships.length || ships[index] == null) {
            return false;
        }
        ships[index] = null;
        numberOfShips--;
        return true;
    }

    @Override
    public int getWeight() {
        int weight = 0;
        for (Ship ship : ships) {
            if (ship != null) {
                weight += ship.getWeight();
            }
        }
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("I am port, my ships are: \n");
        for (Ship ship : ships) {
            if (ship != null) {
                result.append(ship).append("\n");
            }
        }
        result.append("This is the end of port! \n");
        return result.toString();
    }
}
