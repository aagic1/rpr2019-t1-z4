package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {


    @Test
    public void dodajUPunSupermarket() {
        Supermarket s = new Supermarket();
        for(int i = 0; i < 1000; i++) {
            s.dodajArtikl(new Artikl("artikl", 20, Integer.toString(i)));
        }
        boolean jeDodan = s.dodajArtikl(new Artikl("artikl", 15, "1000"));
        assertFalse(jeDodan);
    }

    @Test
    public void dodajUSupermarket() {
        Supermarket s = new Supermarket();
        boolean jeDodan = s.dodajArtikl(new Artikl("sok", 1, "234"));
        assertTrue(jeDodan);
    }


    @Test
    public void izbaciNepostojeciArtikl() {
        Supermarket s = new Supermarket();
        for(int i = 0; i < 3; i++)
            s.dodajArtikl(new Artikl("nesto", 10, Integer.toString(i)));
        Artikl izbaceni = s.izbaciArtiklSaKodom("15");
        assertNull(izbaceni);

    }

    @Test
    public void izbaciPostojeciArtikl () {
        Supermarket s = new Supermarket();
        for(int i = 0; i < 3; i++)
            s.dodajArtikl(new Artikl("nesto", 10, Integer.toString(i)));
        Artikl izbaceni = s.izbaciArtiklSaKodom("2");
        assertEquals(new Artikl("nesto", 10, Integer.toString(2)), izbaceni);
    }
}