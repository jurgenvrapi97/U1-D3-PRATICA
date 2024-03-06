package esercizio3;

import entities.Articolo;
import entities.Carrello;
import entities.Cliente;

public class es3 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCliente(1234, "mario rossi", "mariorossi@gmail.com", "15/12/2006");
        Articolo articolo1 = new Articolo();
        articolo1.setArticolo(1232, "tostapane", 30.5, 2);

        Carrello carrello = new Carrello(cliente);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo1);

        double totaleCosto = carrello.calcolaTotaleCosto();
        System.out.println("Totale costo nel carrello: " + totaleCosto + " euro");
    }
}
