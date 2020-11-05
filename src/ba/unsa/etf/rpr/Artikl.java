package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public Artikl(Artikl a) {
        naziv = a.getNaziv();
        cijena = a.getCijena();
        kod = a.getKod();
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikl artikl = (Artikl) o;
        return cijena == artikl.cijena &&
                Objects.equals(naziv, artikl.naziv) &&
                Objects.equals(kod, artikl.kod);
    }
}
