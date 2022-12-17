package Geometria2D;
public class Heptagono {
    double area, perimetro, apotema;
    public Heptagono(){
        area=0;
        perimetro=0;
        apotema=0;
    }
    private double Area_Heptagono(double lad){
        return (Perimetro_Heptagono(lad)*Apotema_Heptagono(lad))/2;
    }
    private double Perimetro_Heptagono(double lad){
        return lad+lad+lad+lad+lad+lad;
    }
    private double Apotema_Heptagono(double lad){
        return Math.sqrt(3*(lad/2))/2;
    }
    //
    public double getArea(double lad) {
        return area=Area_Heptagono(lad);
    }
    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Heptagono(lad);
    }

    public double getApotema(double lad) {
        return apotema=Apotema_Heptagono(lad);
    }
}
