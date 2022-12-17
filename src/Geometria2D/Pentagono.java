package Geometria2D;
public class Pentagono {
    double apotema, area, perimetro;
    public Pentagono(){
        apotema=0;
        area=0;
        perimetro=0;
    }

    private double Area_Pentagono(double lad){
        return (5*lad*Apotema_Pentagono(lad))/2;
    }
    private double Perimetro_Pentagono(double lad){
        return lad+lad+lad+lad+lad;
    }
    private double Apotema_Pentagono(double lad){
        return lad/1.45;
    }
    //
    public double getArea(double lad) {
        return area=Area_Pentagono(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Pentagono(lad);
    }
    public double getApotema(double lad) {
        return apotema=Apotema_Pentagono(lad);
    }
}