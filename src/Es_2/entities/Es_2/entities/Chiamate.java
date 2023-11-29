package Es_2.entities.Es_2.entities;

public class Chiamate {
   private int durata;
    private String mittente;


    public Chiamate(int duarata1, String mittente1){
        durata=duarata1;
        mittente=mittente1;
    }
    public Chiamate(){

    }

    @Override
    public String toString() {
        return "Chiamate{" +
                "durata=" + durata +
                ", mittente='" + mittente + '\'' +
                '}';
    }
}

