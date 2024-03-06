package entities;

public class Chiamata {
    private String numeroChiamato;
    private int minuti;

    public Chiamata(String numeroChiamato, int durataChiamata) {
        this.numeroChiamato = numeroChiamato;
        this.minuti = durataChiamata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurataMinuti() {
        return minuti;
    }
}
