package eu.senla.super_port.ship;

import eu.senla.super_port.deck.Deck;
import eu.senla.super_port.weighable.Weighable;
import java.util.ArrayList;
import java.util.List;

public class Ship implements Weighable {

    private final List<Deck> decks = new ArrayList<>();
    private final int maxNumberOfDecks;
    private final String name;

    public Ship(int numberOFDecks, String name) {
        int factNumOfDecks = switch (numberOFDecks) {
            case 2 -> 2;
            default -> 1;
        };
        maxNumberOfDecks = factNumOfDecks;
        this.name = name;
    }

    @Override
    public int getWeight() {
        return getWeightFromWeighables(decks);
    }

    public boolean addDeck(Deck deck) {
        if (decks.size() < maxNumberOfDecks) {
            return decks.add(deck);
        }
        return false;
    }

    @Override
    public String toString() {
        return "I am ship \"" + name + "\", my decks are + " + decks;
    }
}
