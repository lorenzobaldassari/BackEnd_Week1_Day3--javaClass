package Es_3;

import Es_3.entities.Articolo;
import Es_3.entities.Carrello;
import Es_3.entities.Cliente;

public class Main {
        public static void main(String[] args) {
            Cliente aldo = new Cliente("15484", "Aldo", "Baglio", "ggg@gmail.com", "28/1/2023");
            Carrello CarreloAldo= new Carrello("Aldo","511616-515161-5156156",98.99);
            Articolo articoloAldo= new Articolo("484811","una bella lampada",51.88,6);
            System.out.println(aldo);
            System.out.println(articoloAldo);
            System.out.println(CarreloAldo);

        }
    }