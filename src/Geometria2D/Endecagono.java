package Geometria2D;

public class Endecagono {
    double apotema, area, perimetro;
    public Endecagono(){
        apotema=0;
        area=0;
        perimetro=0;
    }
    private double Area_Endecagono(double lad){
        return (11*Apotema_Endecagono(lad)*lad)/2;
    }
    private double Perimetro_Endecagono(double lad){
        return 11*lad;
    }
    private double Apotema_Endecagono(double lad){
        return (lad/2)*(Math.sin(9*Math.PI/22)/Math.sin(Math.PI/11));
    }

    //
    public double getArea(double lad) {
        return area=Area_Endecagono(lad);
    }
    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Endecagono(lad);
    }
    public double getApotema(double lad) {
        return apotema=Apotema_Endecagono(lad);
    }
}
