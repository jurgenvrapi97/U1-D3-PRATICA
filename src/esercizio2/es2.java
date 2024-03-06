package esercizio2;


import entities.Sim;

import java.net.SocketImpl;

public class es2 {
    public static void main(String[] args) {
        Sim nuovaSim = new Sim("123456790");
        nuovaSim.effettuaRicarica(10);
        nuovaSim.effettuaChiamata("34438438", 15);
        nuovaSim.effettuaChiamata("564894379", 5);

        nuovaSim.stampaDatiSim();
    }
}
