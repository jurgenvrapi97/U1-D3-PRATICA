package entities;

public class Cliente {
    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private String dataIscrizione;

    public void setCliente(int cod, String nomCogn, String mail, String data) {
        this.codiceCliente = cod;
        this.nomeCognome = nomCogn;
        this.email = mail;
        this.dataIscrizione = data;
    }
}
