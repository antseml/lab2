import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Clefable("FT1", 3));
        b.addFoe(new Clefairy("FT2", 3));
        b.addAlly(new Cleffa("ST1", 3));
        b.addFoe(new Crabominable("ST2", 3));
        b.addAlly(new Crabrawler("TT1", 3));
        b.addFoe(new Torkoal("TT2", 3));
        b.go();
    }
}