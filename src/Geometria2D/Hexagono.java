package Geometria2D;
public class Hexagono {
    double area, perimetro, apotema;
    public Hexagono(){
        area=0;
        perimetro=0;
        apotema=0;
    }
    public double Area_Hexagono(double lad){
        return (Perimetro_Hexagono(lad)*Apotema_Hexagono(lad))/2;
    }
    public double Perimetro_Hexagono(double lad){
        return lad+lad+lad+lad+lad+lad;
    }
    public double Apotema_Hexagono(double lad){
        return Math.sqrt(3*(lad/2))/2;
    }
    //

    public double getArea(double lad) {
        return area=Area_Hexagono(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Hexagono(lad);
    }

    public double getApotema(double lad) {
        return apotema=Apotema_Hexagono(lad);
    }
}
