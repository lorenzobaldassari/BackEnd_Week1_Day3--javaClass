package Es_1.Entities;

public class Rettangolo {
    private int altezza;
    private int lunghezza;

    private int area;
    private int perimetro;



    public Rettangolo(int altezza1,int lunghezza1){
       altezza=altezza1;
       lunghezza=lunghezza1;
       area=this.area();
       perimetro=this.perimetro();
    }


    public  int perimetro (){
        int perimetro1=(altezza+lunghezza)*2;
        return perimetro1;

    }


    private  int area (){
        int area1=(altezza*lunghezza);
        return area1;
    }
//
    public  int getPerimetro() {
        return perimetro;
    }
//
    public  int getArea() {
        return area;
    }

    public  int getLunghezza() {
        return lunghezza;
    }

    public  int getAltezza() {
        return altezza;
    }
}
