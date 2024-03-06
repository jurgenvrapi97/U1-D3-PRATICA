package entities;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int pezziDisponibili;


    public void setArticolo(int cod, String desc, double prezzo, int pezzi) {
        this.codiceArticolo = cod;
        this.descrizione = desc;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezzi;
    }

    public double getPrezzo() {
        return prezzo;
    }
    public double getPezzi() {
        return pezziDisponibili;
    }
}
