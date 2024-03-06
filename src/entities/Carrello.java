package entities;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new Articolo[10];
    }

    public void aggiungiArticolo(Articolo articolo) {
    if (articolo.getPezzi()!= 0){
        for (int i = articoli.length - 1; i > 0; i--) {
            articoli[i] = articoli[i - 1];
        }
        articoli[0] = articolo;
    }else{
        System.err.println("articolo terminato sarà presto disponibile");
    }

    }

    public double calcolaTotaleCosto() {
        double totale = 0.0;
        for (int i=0; i<articoli.length; i++){
            if  (articoli[i] != null){
                totale += articoli[i].getPrezzo();
            }
        }
        return totale;
    }


}

