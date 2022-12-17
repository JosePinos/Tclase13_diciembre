package Geometria2D;
public class Octagono {
    double apotema, area, perimetro;
    public Octagono(){
        apotema=0;
        area=0;
        perimetro=0;
    }
    private double Area_Octagono(double per, double apt){
        return (per*apt)/2;
    }
    private double Perimetro_Octagono(double lad){
        return lad*8;
    }
    private double Apotema_Octagono(double lad){
        return lad/(2*Math.tan(22.5));
    }
    //

    public double getArea(double per, double ap) {
        return area=Area_Octagono(per, ap);
    }
    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Octagono(lad);
    }
    public double getApotema(double lad) {
        return apotema=Apotema_Octagono(lad);
    }
}
