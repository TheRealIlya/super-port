package eu.senla.super_port;

import eu.senla.super_port.container.BigContainer;
import eu.senla.super_port.container.Container;
import eu.senla.super_port.container.SmallContainer;
import eu.senla.super_port.container.density.WaterDensity;
import eu.senla.super_port.deck.Deck;
import eu.senla.super_port.port.Port;
import eu.senla.super_port.ship.Ship;

public class Test {

    public static void main(String[] args) {

        Container firstSmallContainer = new SmallContainer(9, WaterDensity.MEDIUM);
        Container secondSmallContainer = new SmallContainer(99, WaterDensity.LIGHT);
        Container thirdSmallContainer = new SmallContainer(20, WaterDensity.MEDIUM);

        Container firstBigContainer = new BigContainer(4, WaterDensity.HEAVY);
        Container secondBigContainer = new BigContainer(15, WaterDensity.HEAVY);
        Container thirdBigContainer = new BigContainer(35, WaterDensity.LIGHT);

        Deck deck1 = new Deck();
        deck1.addContainer(firstBigContainer);
        deck1.addContainer(secondBigContainer);
        deck1.addContainer(thirdBigContainer);
        System.out.println(deck1);

        Deck deck2 = new Deck();
        deck2.addContainer(firstSmallContainer);
        deck2.addContainer(secondSmallContainer);
        deck2.addContainer(thirdSmallContainer);
        System.out.println(deck2);

        Deck deck3 = new Deck();
        deck3.addContainer(thirdBigContainer);

        Ship ship1 = new Ship(9, "1");
        ship1.addDeck(deck1);
        ship1.addDeck(deck2);
        System.out.println(ship1);

        Ship ship2 = new Ship(1, "2");
        Ship ship3 = new Ship(1, "3");

        Port port = new Port(10);
        port.addShip(ship1);
        port.addShip(ship2);
        port.addShip(ship3);
        port.deleteShipByIndex(1);

        System.out.println('\n' + "****************" + '\n');
        System.out.println(port);

        Ship ship = new Ship(2, "4, but actually 2");
        ship.addDeck(deck2);
        ship.addDeck(deck3);
        port.addShip(ship);

        System.out.println("----------------" + '\n');
        System.out.println(port);

        System.out.println("PORT WEIGHT: " + port.getWeight());
        int totalContainerWeight = firstSmallContainer.getWeight() + secondSmallContainer.getWeight() +
                thirdSmallContainer.getWeight() + firstBigContainer.getWeight() + secondBigContainer.getWeight() +
                thirdBigContainer.getWeight();
        System.out.println("TOTAL CONTAINER WEIGHT: " + totalContainerWeight);

    }

}
