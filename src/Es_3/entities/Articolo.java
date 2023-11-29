package Es_3.entities;

public class Articolo {

    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziMagazzino;

    public Articolo(String cod,String des , double price, int pezzi){
        codiceArticolo=cod;
        descrizioneArticolo=des;
        prezzo=price;
        pezziMagazzino=pezzi;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo='" + codiceArticolo + '\'' +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", pezziMagazzino=" + pezziMagazzino +
                '}';
    }
}
