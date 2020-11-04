package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli;
    private static final int MAX_BROJ_ARTIKALA = 50;

    public Korpa() {
        artikli = new ArrayList<Artikl>();
    }

    public boolean dodajArtikl(Artikl a) {
        if(artikli.size() >= MAX_BROJ_ARTIKALA)
            return false;
        artikli.add(a);
        return true;

}

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < artikli.size(); i++) {
            if(artikli.get(i).getKod().equals(kod)) {
                Artikl temp = artikli.get(i); //new Artikl(artikli.get(i).getNaziv(), artikli.get(i).getCijena(), artikli.get(i).getKod());
                artikli.remove(i);
                return temp;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (int i = 0; i < artikli.size(); i++) {
            ukupnaCijena = ukupnaCijena + artikli.get(i).getCijena();
        }
        return ukupnaCijena;
    }
}