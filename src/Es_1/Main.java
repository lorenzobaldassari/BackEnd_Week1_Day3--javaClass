package Es_1;


import Es_1.Entities.Rettangolo;

public class Main {
    public static void main(String[] args) {

        Rettangolo rett1= new Rettangolo(10,5);
        Rettangolo rett2= new Rettangolo(5,6);

//
        stampaRettangolo(rett1);
        stampaDueRettangoli(rett1,rett2);
    }

    public static void stampaRettangolo(Rettangolo rett){
        System.out.println("il perimetro e' "+rett.getPerimetro()+ " mentre l'area e' "+rett.getArea());
//

    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2){
        int sommaAree= rett1.getArea()+rett2.getArea();
        int sommaPerimetri= rett1.getPerimetro()+rett2.getPerimetro();
        System.out.println("il perimetro e' "+rett1.getPerimetro()+ " mentre l'area e' "+rett1.getArea());
        System.out.println("il perimetro e' "+rett2.getPerimetro()+ " mentre l'area e' "+rett2.getArea());
        System.out.println("la somme dei perimetri e' "+sommaPerimetri+ " mentre la somma delle aree e' "+sommaAree);
    }



}