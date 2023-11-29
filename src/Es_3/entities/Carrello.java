package Es_3.entities;

public class Carrello {

     private String clienteAssociato;
     private String elencoArticoli;
     private double totaleCostoArticoli;

     public Carrello(String cliente, String elenco, double totalw){
         clienteAssociato=cliente;
         elencoArticoli=elenco;
         totaleCostoArticoli=totalw;
     }

    @Override
    public String toString() {
        return "Carrello{" +
                "clienteAssociato='" + clienteAssociato + '\'' +
                ", elencoArticoli='" + elencoArticoli + '\'' +
                ", totaleCostoArticoli=" + totaleCostoArticoli +
                '}';
    }
}


