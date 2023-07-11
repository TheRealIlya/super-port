package eu.senla.super_port.ship;

import eu.senla.super_port.deck.Deck;
import eu.senla.super_port.weighable.Weighable;
import java.util.Arrays;

public class Ship implements Weighable {

    private final Deck[] decks;
    private final int maxNumberOfDecks;
    private final String name;
    private int numberOFDecks = 0;

    public Ship(int numberOFDecks, String name) {
        int factNumOfDecks = switch (numberOFDecks) {
            case 2 -> 2;
            default -> 1;
        };
        decks = new Deck[factNumOfDecks];
        maxNumberOfDecks = factNumOfDecks;
        this.name = name;
    }

    @Override
    public int getWeight() {
        int weight = 0;
        for (Deck deck : decks) {
            if (deck != null) {
                weight += deck.getWeight();
            }
        }
        return weight;
    }

    public boolean addDeck(Deck deck) {
        if (numberOFDecks < maxNumberOfDecks) {
            decks[numberOFDecks++] = deck;
            return true;
        }
        return false;
    }

    public Deck[] getDecks() {
        return decks;
    }

    @Override
    public String toString() {
        return "I am ship \"" + name + "\", my decks are + " + Arrays.toString(decks);
    }
}
