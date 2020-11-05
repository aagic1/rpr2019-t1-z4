package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    public void konstruktori() {
        Artikl a = new Artikl("naziv", 10, "kod");
        Artikl b = a;
        assertEquals(a, b);
    }

}