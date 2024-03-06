package entities;

public class Sim {
    private String numeroTelefono;
    private double credito;
    private Chiamata[] chiamate;



    public  Sim (String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.chiamate = new Chiamata[5];
    }

    public void effettuaRicarica(int importo){
        credito += importo;
        System.out.println("Grazie per la ricarica il tuo credito è di: " + credito + " euro");
    }

    public void effettuaChiamata(String numeroChiamato, int minuti) {
        Chiamata nuovaChiamata = new Chiamata(numeroChiamato, minuti);
        aggiungiChiamata(nuovaChiamata);
        credito -= minuti * 0.10;
    }

    private void aggiungiChiamata(Chiamata nuovaChiamata) {

        for (int i = chiamate.length - 1; i > 0; i--) {
            chiamate[i] = chiamate[i - 1];
        }
        chiamate[0] = nuovaChiamata;
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime chiamate effettuate:");
        for (int i=0; i<chiamate.length; i++) {
            if (chiamate[i] != null) {
                System.out.println("Numero chiamato: " + chiamate[i].getNumeroChiamato() +
                        ", Durata: " + chiamate[i].getDurataMinuti() + " minuti");
            }
        }
    }
}
