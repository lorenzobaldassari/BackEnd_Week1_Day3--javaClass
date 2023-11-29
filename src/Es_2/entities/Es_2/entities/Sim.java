package Es_2.entities.Es_2.entities;

import java.util.Arrays;

public class Sim {
    private String numeroDiTelefono;
    private int credito;
    private Chiamate[] chiamate;


    public Sim (String numero){
        numeroDiTelefono=numero;
        credito=0;
        chiamate= new Chiamate[]{ new Chiamate(),new Chiamate(),new Chiamate(),new Chiamate(),new Chiamate(),};
    }
    public void printSim(){
        System.out.println("numero di telefono: "+numeroDiTelefono +" credito residuo: "
                +credito+" "+"ultime 5 chiamate:"+ Arrays.toString(chiamate));
    }
}
