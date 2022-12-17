package Geometria2D;
public class Nonagono {
    double apotema, area, perimetro;
    public Nonagono(){
        apotema=0;
        area=0;
        perimetro=0;
    }
    private double Area_Nonagono(double lad){
        return (9*Apotema_Nonagono(lad)*lad)/2;
    }
    private double Perimetro_Nonagono(double lad){
        return 9*lad;
    }
    private double Apotema_Nonagono(double lad){
        return (lad/2)*(Math.sin(70)/Math.sin(20));
    }
    //
    public double getArea(double lad) {
        return area=Area_Nonagono(lad);
    }
    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Nonagono(lad);
    }
    public double getApotema(double lad) {
        return apotema=Apotema_Nonagono(lad);
    }
}
